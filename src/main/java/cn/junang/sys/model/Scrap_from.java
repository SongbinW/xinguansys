package cn.junang.sys.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Scrap_from {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scrap_from.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scrap_from.chec_id
     *
     * @mbg.generated
     */
    private Integer checId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scrap_from.sup_name
     *
     * @mbg.generated
     */
    private String supName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scrap_from.spe_model
     *
     * @mbg.generated
     */
    private String speModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scrap_from.unit
     *
     * @mbg.generated
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scrap_from.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scrap_from.scr_data
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date scrData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scrap_from.id
     *
     * @return the value of scrap_from.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scrap_from.id
     *
     * @param id the value for scrap_from.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scrap_from.chec_id
     *
     * @return the value of scrap_from.chec_id
     *
     * @mbg.generated
     */
    public Integer getChecId() {
        return checId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scrap_from.chec_id
     *
     * @param checId the value for scrap_from.chec_id
     *
     * @mbg.generated
     */
    public void setChecId(Integer checId) {
        this.checId = checId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scrap_from.sup_name
     *
     * @return the value of scrap_from.sup_name
     *
     * @mbg.generated
     */
    public String getSupName() {
        return supName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scrap_from.sup_name
     *
     * @param supName the value for scrap_from.sup_name
     *
     * @mbg.generated
     */
    public void setSupName(String supName) {
        this.supName = supName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scrap_from.spe_model
     *
     * @return the value of scrap_from.spe_model
     *
     * @mbg.generated
     */
    public String getSpeModel() {
        return speModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scrap_from.spe_model
     *
     * @param speModel the value for scrap_from.spe_model
     *
     * @mbg.generated
     */
    public void setSpeModel(String speModel) {
        this.speModel = speModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scrap_from.unit
     *
     * @return the value of scrap_from.unit
     *
     * @mbg.generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scrap_from.unit
     *
     * @param unit the value for scrap_from.unit
     *
     * @mbg.generated
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scrap_from.quantity
     *
     * @return the value of scrap_from.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scrap_from.quantity
     *
     * @param quantity the value for scrap_from.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scrap_from.scr_data
     *
     * @return the value of scrap_from.scr_data
     *
     * @mbg.generated
     */
    public Date getScrData() {
        return scrData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scrap_from.scr_data
     *
     * @param scrData the value for scrap_from.scr_data
     *
     * @mbg.generated
     */
    public void setScrData(Date scrData) {
        this.scrData = scrData;
    }
}