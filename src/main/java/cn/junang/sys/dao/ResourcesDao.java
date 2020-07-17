package cn.junang.sys.dao;

import cn.junang.sys.model.SysResources;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author songbin
 * @create 2020-06-29 17:27
 */
public interface ResourcesDao {
    @Select("SELECT * FROM sys_resources WHERE ismenu =1 AND id IN(SELECT res_id FROM sys_role_resources WHERE role_id IN(SELECT role_id FROM sys_user_role WHERE user_id=#{userId}))")
    List<SysResources> getMeun(@Param("userId") Long userId);
    @Select("SELECT * FROM sys_resources WHERE id IN (SELECT res_id FROM sys_role_resources WHERE role_id=#{roleId})")
    List<SysResources>getResByRoleId(@Param("roleId") Long roleId);
    @Select("SELECT perms FROM sys_resources WHERE perms is not null AND id IN( SELECT res_id FROM sys_role_resources WHERE role_id IN( SELECT role_id FROM sys_user_role WHERE user_id=#{userId}))")
    List<String> getPerms(@Param("userId") Long userId);
}
