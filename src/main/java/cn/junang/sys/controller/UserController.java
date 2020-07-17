package cn.junang.sys.controller;

import cn.junang.common.model.PageBean;
import cn.junang.common.model.R;
import cn.junang.sys.model.SysUser;
import cn.junang.sys.service.UserServise;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

/**
 * @author songbin
 * @create 2020-07-01 9:10
 */
@RestController
@RequestMapping("sys/user")
@Api(tags = "用户管理")
public class UserController {
    private final UserServise userServise;

    public UserController(UserServise userServise) {
        this.userServise = userServise;
    }

    @GetMapping
    @RequiresPermissions("sys:user:get")
    public R getUser(String username, PageBean pageBean) {
        return userServise.getUser(username, pageBean);
    }

    @PostMapping
    public R addUser(@RequestBody SysUser user) {
        return userServise.addUser(user);
    }

    @PutMapping
    public R editUser(@RequestBody SysUser user) {
        return userServise.editUser(user);
    }
    @PostMapping("login")
    public R login(String username,String password){
        return userServise.login(username,password);
    }
    @GetMapping("info")
    public R info(){
        return userServise.info();
    }
}
