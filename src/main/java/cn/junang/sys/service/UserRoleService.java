package cn.junang.sys.service;

import cn.junang.common.model.R;

/**
 * @author Mr.s°
 * @create 2020-07-03 10:29
 */
public interface UserRoleService {

    R assignRole(Long userId, String roleIds);
}
