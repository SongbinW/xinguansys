package cn.junang.sys.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * @author Mr.s°
 * @create 2020-07-03 10:48
 */
public interface UserRoleDao {
    @Insert("INSERT INTO sys_user_role (user_id,role_id) SELECT #{userId},id FROM sys_role WHERE id IN(${roleIds})")
    Integer insert(@Param("userId")Long userId,@Param("roleIds") String roleIds);
}
