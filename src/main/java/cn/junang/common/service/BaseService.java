package cn.junang.common.service;

import cn.junang.vo.ActiveUser;
import org.apache.shiro.SecurityUtils;

/**
 * @author songbin
 * @create 2020-06-29 20:48
 */
public abstract class BaseService {
    public Long getUserId() {
        ActiveUser user= getUser();
        return user.getUser().getId();
    }
    public ActiveUser getUser(){
        return (ActiveUser) SecurityUtils.getSubject().getPrincipal();
    }
}