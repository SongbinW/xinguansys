package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;

/**
 * @author Mr.s°
 * @create 2020-07-03 8:51
 */
public interface RoleService {

    R assignRoles(Long userId);

    R roles(String roleName, PageBean pageBean);
}
