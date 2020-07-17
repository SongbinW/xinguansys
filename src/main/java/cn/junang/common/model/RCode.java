package cn.junang.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author songbin
 * @create 2020-06-29 20:35
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum RCode {
    SUCCESS(200,"操作成功"),
    ERROR(400,"操作失败"),
    //token认证错误
    TOKENERROR(4001,"token认证错误"),
    TOKENINVAILD(4002,"token无效,您无权访问"),
    USER_NAME_PASSWORD(4003,"用户名或者密码错误"),
    NO_FOUND(4004,"路径不存在"),
    INVE_NAME_REPEAT(500,"该物资种类已存在！"),
    REPEAT_KEY(4005,"重复记录"),
    AUTHORZITION_ERROR(4006,"没有权限，联系管理员授权"),
    USERNAMEREPEAT(500,"用户名存在");
    private Integer code;
    private String msg;
}
