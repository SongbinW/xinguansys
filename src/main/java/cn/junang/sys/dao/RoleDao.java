package cn.junang.sys.dao;

import cn.junang.sys.model.SysRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Mr.s°
 * @create 2020-07-03 9:10
 */
public interface RoleDao {
    @Select("SELECT id `key`,`name` label FROM sys_role WHERE isdel=0")
    List<Map<String, Object>> getAllRole();

    @Select("SELECT role_id FROM sys_user_role WHERE user_id=#{userId}")
    List<Long> getRoleIdByUserId(@Param("userId") Long userId);

    @Select("SELECT * FROM sys_role WHERE isdel=0 and id IN (SELECT role_id FROM sys_user_role WHERE user_id =#{userId})")
    List<SysRole> getRoleByUserId(@Param("userId") Long userId);
}
