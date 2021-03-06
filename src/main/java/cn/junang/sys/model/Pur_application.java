package cn.junang.sys.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Pur_application {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.data
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date data;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.sup_name
     *
     * @mbg.generated
     */
    private String supName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.spe_model
     *
     * @mbg.generated
     */
    private String speModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.unit
     *
     * @mbg.generated
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.applicant
     *
     * @mbg.generated
     */
    private String applicant;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.req_number
     *
     * @mbg.generated
     */
    private String reqNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_application.inv_id
     *
     * @mbg.generated
     */
    private Integer invId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.id
     *
     * @return the value of pur_application.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.id
     *
     * @param id the value for pur_application.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.data
     *
     * @return the value of pur_application.data
     *
     * @mbg.generated
     */
    public Date getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.data
     *
     * @param data the value for pur_application.data
     *
     * @mbg.generated
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.sup_name
     *
     * @return the value of pur_application.sup_name
     *
     * @mbg.generated
     */
    public String getSupName() {
        return supName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.sup_name
     *
     * @param supName the value for pur_application.sup_name
     *
     * @mbg.generated
     */
    public void setSupName(String supName) {
        this.supName = supName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.spe_model
     *
     * @return the value of pur_application.spe_model
     *
     * @mbg.generated
     */
    public String getSpeModel() {
        return speModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.spe_model
     *
     * @param speModel the value for pur_application.spe_model
     *
     * @mbg.generated
     */
    public void setSpeModel(String speModel) {
        this.speModel = speModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.unit
     *
     * @return the value of pur_application.unit
     *
     * @mbg.generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.unit
     *
     * @param unit the value for pur_application.unit
     *
     * @mbg.generated
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.quantity
     *
     * @return the value of pur_application.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.quantity
     *
     * @param quantity the value for pur_application.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.applicant
     *
     * @return the value of pur_application.applicant
     *
     * @mbg.generated
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.applicant
     *
     * @param applicant the value for pur_application.applicant
     *
     * @mbg.generated
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.req_number
     *
     * @return the value of pur_application.req_number
     *
     * @mbg.generated
     */
    public String getReqNumber() {
        return reqNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.req_number
     *
     * @param reqNumber the value for pur_application.req_number
     *
     * @mbg.generated
     */
    public void setReqNumber(String reqNumber) {
        this.reqNumber = reqNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_application.inv_id
     *
     * @return the value of pur_application.inv_id
     *
     * @mbg.generated
     */
    public Integer getInvId() {
        return invId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_application.inv_id
     *
     * @param invId the value for pur_application.inv_id
     *
     * @mbg.generated
     */
    public void setInvId(Integer invId) {
        this.invId = invId;
    }
}