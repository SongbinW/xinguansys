package cn.junang.sys.service.impl;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.PageResult;
import cn.junang.common.model.R;
import cn.junang.common.service.BaseService;
import cn.junang.sys.dao.ResourcesDao;
import cn.junang.sys.dao.RoleDao;
import cn.junang.sys.mapper.SysRoleMapper;
import cn.junang.sys.model.SysResources;
import cn.junang.sys.model.SysRole;
import cn.junang.sys.model.SysRoleExample;
import cn.junang.sys.service.ResourcesService;
import cn.junang.sys.service.RoleService;
import cn.junang.vo.MenuNodeVo;
import cn.junang.vo.RoleVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mr.s°
 * @create 2020-07-03 8:51
 */
@Service
public class RoleServiceImpl extends BaseService implements RoleService {
    private final SysRoleMapper sysRoleMapper;
    private final RoleDao roleDao;
    private final ResourcesDao resourcesDao;
    private final ResourcesService resourcesService;

    public RoleServiceImpl(SysRoleMapper sysRoleMapper, RoleDao roleDao, ResourcesDao resourcesDao, ResourcesService resourcesService) {
        this.sysRoleMapper = sysRoleMapper;
        this.roleDao = roleDao;
        this.resourcesDao = resourcesDao;
        this.resourcesService = resourcesService;
    }


    @Override
    public R assignRoles(Long userId) {
        List<Map<String, Object>> allRole = roleDao.getAllRole();
        List<Long> roleIds = roleDao.getRoleIdByUserId(userId);
        HashMap<String, Object> map = new HashMap<>();
        map.put("roles", allRole);
        map.put("roleIds", roleIds);
        return R.ok(map);

    }

    @Override
    public R roles(String roleName, PageBean pageBean) {
        SysRoleExample example = new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria().andIsdelEqualTo(false);
        if (!StringUtils.isEmpty(roleName)) {
            criteria.andNameLike("%" + roleName + "%");
        }
        PageHelper.startPage(pageBean.getPage(), pageBean.getSize());
        PageInfo<SysRole> info = new PageInfo<>(sysRoleMapper.selectByExample(example));
        List<RoleVo> roleVos = new ArrayList<>();
        info.getList().forEach(role -> {
            List<SysResources> ress = resourcesDao.getResByRoleId(role.getId());
            List<MenuNodeVo> tree = resourcesService.getTree(ress);
            RoleVo roleVo = new RoleVo();
            BeanUtils.copyProperties(role, roleVo);
            roleVo.setChildren(tree);
            roleVos.add(roleVo);
        });
        return R.ok(new PageResult<>(info.getTotal(), roleVos));
    }
}
