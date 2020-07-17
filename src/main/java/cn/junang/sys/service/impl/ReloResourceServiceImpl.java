package cn.junang.sys.service.impl;

import cn.junang.common.model.R;
import cn.junang.common.service.BaseService;
import cn.junang.sys.dao.ReloResourceDao;
import cn.junang.sys.mapper.SysRoleResourcesMapper;
import cn.junang.sys.model.SysRoleResources;
import cn.junang.sys.model.SysRoleResourcesExample;
import cn.junang.sys.service.ReloResourceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Mr.s°
 * @create 2020-07-06 9:27
 */
@Service
public class ReloResourceServiceImpl extends BaseService implements ReloResourceService {
    private final SysRoleResourcesMapper sysRoleResourcesMapper;
    private final ReloResourceDao reloResourceDao;

    public ReloResourceServiceImpl(SysRoleResourcesMapper sysRoleResourcesMapper, ReloResourceDao reloResourceDao) {
        this.sysRoleResourcesMapper = sysRoleResourcesMapper;
        this.reloResourceDao = reloResourceDao;
    }


    @Override
    public R delete(Long roleId, String ResIds) {
        reloResourceDao.delete(roleId, ResIds);
        return R.ok();
    }

    @Override
    @Transactional
    public R update(Long roleId, SysRoleResources[] roleRes) {
        SysRoleResourcesExample example = new SysRoleResourcesExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        sysRoleResourcesMapper.deleteByExample(example);
        if(roleRes !=null && roleRes.length>0){
            reloResourceDao.insert(roleRes);
        }
        return R.ok();
    }
}

