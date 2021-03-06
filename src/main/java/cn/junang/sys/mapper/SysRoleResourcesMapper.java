package cn.junang.sys.mapper;

import cn.junang.sys.model.SysRoleResources;
import cn.junang.sys.model.SysRoleResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleResourcesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    long countByExample(SysRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    int deleteByExample(SysRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    int insert(SysRoleResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    int insertSelective(SysRoleResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    List<SysRoleResources> selectByExample(SysRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    SysRoleResources selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysRoleResources record, @Param("example") SysRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysRoleResources record, @Param("example") SysRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysRoleResources record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resources
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysRoleResources record);
}