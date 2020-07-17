package cn.junang.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author songbin
 * @create 2020-07-01 10:04
 */
@Data
public class UserInputVo {
    private String email;
    private String phone;
    private Boolean isvaild;
    private Integer sex;
    private Date birth;
    private Long departmentId;
    private String remark;
}
