package cn.junang.sys.model;

import java.util.Date;

public class Mate_category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mate_category.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mate_category.sup_name
     *
     * @mbg.generated
     */
    private String supName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mate_category.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mate_category.modified_time
     *
     * @mbg.generated
     */
    private Date modifiedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mate_category.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mate_category.id
     *
     * @return the value of mate_category.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mate_category.id
     *
     * @param id the value for mate_category.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mate_category.sup_name
     *
     * @return the value of mate_category.sup_name
     *
     * @mbg.generated
     */
    public String getSupName() {
        return supName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mate_category.sup_name
     *
     * @param supName the value for mate_category.sup_name
     *
     * @mbg.generated
     */
    public void setSupName(String supName) {
        this.supName = supName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mate_category.create_time
     *
     * @return the value of mate_category.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mate_category.create_time
     *
     * @param createTime the value for mate_category.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mate_category.modified_time
     *
     * @return the value of mate_category.modified_time
     *
     * @mbg.generated
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mate_category.modified_time
     *
     * @param modifiedTime the value for mate_category.modified_time
     *
     * @mbg.generated
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mate_category.remarks
     *
     * @return the value of mate_category.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mate_category.remarks
     *
     * @param remarks the value for mate_category.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}