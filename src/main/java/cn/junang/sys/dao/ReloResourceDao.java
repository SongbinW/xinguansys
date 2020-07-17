package cn.junang.sys.dao;

import cn.junang.sys.model.SysRoleResources;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

/**
 * @author Mr.s°
 * @create 2020-07-06 9:44
 */
public interface ReloResourceDao {
    @Delete("DELETE FROM sys_role_resources WHERE role_id=#{roleId} AND  res_id IN(${resIds})")
    Integer delete(@Param("roleId") Long roleId,@Param("resIds") String resIds);

    Integer insert(SysRoleResources[] roleRes);
}
