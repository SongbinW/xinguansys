package cn.junang.vo;

import cn.junang.sys.model.SysRole;
import lombok.Data;

import java.util.List;

/**
 * @author Mr.s°
 * @create 2020-07-03 11:43
 */
@Data
public class RoleVo extends SysRole {
    List<MenuNodeVo> children;
}
