package cn.junang.sys.mapper;

import cn.junang.sys.model.MsgInfo;
import cn.junang.sys.model.MsgInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    long countByExample(MsgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    int deleteByExample(MsgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    int insert(MsgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    int insertSelective(MsgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    List<MsgInfo> selectByExample(MsgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    MsgInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MsgInfo record, @Param("example") MsgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MsgInfo record, @Param("example") MsgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MsgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MsgInfo record);
}