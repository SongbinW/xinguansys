package cn.junang.sys.service;

import cn.junang.common.model.R;
import cn.junang.sys.model.SysRoleResources;

/**
 * @author Mr.s°
 * @create 2020-07-06 9:27
 */
public interface ReloResourceService {
    R delete(Long roleId,String ResIds);

    R update(Long roleId, SysRoleResources[] roleRes);
}
