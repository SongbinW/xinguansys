package cn.junang.sys.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author wupl
 * @create 2020-07-16 16:18
 */
public interface CreateId {
    @Select("select f_create_id(${id}) from DUAL")
    String getId(@Param("id") Integer id);
}
