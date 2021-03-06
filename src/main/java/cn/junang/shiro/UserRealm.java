package cn.junang.shiro;

import cn.junang.sys.dao.ResourcesDao;
import cn.junang.sys.dao.RoleDao;
import cn.junang.utils.JWTUtils;
import cn.junang.sys.mapper.SysUserMapper;
import cn.junang.sys.model.SysRole;
import cn.junang.sys.model.SysUser;
import cn.junang.sys.model.SysUserExample;
import cn.junang.vo.ActiveUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wchen
 * @create 2020-07-14 10:27
 */
@Service
public class UserRealm extends AuthorizingRealm {
    private final SysUserMapper userMapper;
    private final RoleDao roleDao;
    private final ResourcesDao resourcesDao;

    public UserRealm(SysUserMapper userMapper, RoleDao roleDao, ResourcesDao resourcesDao) {
        this.userMapper = userMapper;
        this.roleDao = roleDao;
        this.resourcesDao = resourcesDao;
    }

    /**
     * 必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
        String token = (String) auth.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtils.getUsername(token);

        if (username == null) {
            throw new AuthenticationException(" token错误，请重新登入！");
        }
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(username).andIsdelEqualTo(false);
        List<SysUser> sysUsers = userMapper.selectByExample(example);

        if (sysUsers == null || sysUsers.size() < 1) {
            throw new AccountException("账号不存在!");
        }
        SysUser user=sysUsers.get(0);
        if (JWTUtils.isExpire(token)) {
            throw new AuthenticationException(" token过期，请重新登入！");
        }

        if (!JWTUtils.verify(token, username, user.getPassword())) {
            throw new CredentialsException("密码错误!");
        }
        //过滤出url,和用户的权限
        List<SysRole> roles = roleDao.getRoleByUserId(user.getId());
        List<String> perms = resourcesDao.getPerms(user.getId());
        ActiveUser activeUser = new ActiveUser();
        activeUser.setRoles(roles);
        activeUser.setUser(user);
        activeUser.setPermissions(perms);
        return new SimpleAuthenticationInfo(activeUser, token, getName());
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject().getPrincipal();
        List<String> permissions = activeUser.getPermissions();
        permissions.forEach(perm ->{
            authorizationInfo.addStringPermission(perm);
        });
        return authorizationInfo;
    }
}
