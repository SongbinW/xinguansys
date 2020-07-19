package cn.junang.sys.service.impl;

import cn.junang.utils.JWTUtils;
import cn.junang.Shiro.JWTToken;
import cn.junang.common.exception.ServiceException;
import cn.junang.common.model.*;
import cn.junang.common.service.BaseService;
import cn.junang.sys.mapper.SysUserMapper;
import cn.junang.sys.model.SysUser;
import cn.junang.sys.model.SysUserExample;
import cn.junang.sys.service.UserServise;
import cn.junang.utils.MD5Utils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author songbin
 * @create 2020-07-01 9:08
 */
@Service
public class UserServiseImpl extends BaseService implements UserServise {
    private final SysUserMapper sysUserMapper;

    public UserServiseImpl(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    @Override
    public R getUser(String username, PageBean pageBean) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria().andIsdelEqualTo(false);
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        PageHelper.startPage(pageBean.getPage(), pageBean.getSize());
        PageInfo<SysUser> info = new PageInfo<>(sysUserMapper.selectByExample(example));
        return R.ok(new PageResult<SysUser>(info.getTotal(), info.getList()));
    }

    @Override
    public R addUser(SysUser user) {
        if (isUserExist(user.getUsername())) {
            return R.error(RCode.USERNAMEREPEAT);
        }
        user.setIsvaild(true);
        user.setPassword(Constant.PWD);
        sysUserMapper.insertSelective(user);
        return R.ok();
    }

    @Override
    public R editUser(SysUser user) {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(user.getId());
        if ((sysUser.getUsername().equals(user.getUsername()))) {
            if (isUserExist(user.getUsername())) {
                return R.error(RCode.USERNAMEREPEAT);
            }
        }
        user.setPassword(null);
        sysUserMapper.updateByPrimaryKeySelective(user);
        return R.ok();
    }

    @Override
    public R login(String username, String password) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andIsdelEqualTo(false).andUsernameEqualTo(username);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if(sysUsers == null || sysUsers.size()<1){
            throw  new ServiceException(RCode.USER_NAME_PASSWORD);
        }
        SysUser sysUser = sysUsers.get(0);
        String salt = sysUser.getSalt();
        String target = MD5Utils.md5Encryption(password, salt);
//生成token
        String token= JWTUtils.sign(username,target);
        JWTToken jwtToken = new JWTToken(token);
        try {
            SecurityUtils.getSubject().login(jwtToken);
        }catch (AuthenticationException e){
            throw new ServiceException(RCode.TOKENERROR);
        }
        return R.ok(token);
    }

    @Override
    public R info() {
        return R.ok(getUser());
    }

    @Override
    public R delete(Long id) {
        sysUserMapper.deleteByPrimaryKey(id);
        return R.ok();
    }

    @Override
    public R updataUserState(Long id, Boolean isvaild) {
        SysUser user = new SysUser();
        user.setId(id);
        user.setIsvaild(isvaild);
        sysUserMapper.updateByPrimaryKeySelective(user);
        return R.ok();
    }

    private Boolean isUserExist(String username) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andIsdelEqualTo(false)
                .andUsernameEqualTo(username);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if (sysUsers != null && sysUsers.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
