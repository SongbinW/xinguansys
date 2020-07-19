package cn.junang.sys.service;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.SysUser;

/**
 * @author songbin
 * @create 2020-07-01 9:08
 */
public interface UserServise {
    R getUser(String username, PageBean pageBean);

    R addUser(SysUser user);

    R editUser(SysUser user);

    R login(String username, String password);

    R info();

    R delete(Long id);
}
