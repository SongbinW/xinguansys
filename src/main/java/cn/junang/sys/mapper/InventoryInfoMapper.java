package cn.junang.sys.mapper;

import cn.junang.sys.model.InventoryInfo;
import cn.junang.sys.model.InventoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    long countByExample(InventoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    int deleteByExample(InventoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    int insert(InventoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    int insertSelective(InventoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    List<InventoryInfo> selectByExample(InventoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    InventoryInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") InventoryInfo record, @Param("example") InventoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") InventoryInfo record, @Param("example") InventoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(InventoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(InventoryInfo record);
}