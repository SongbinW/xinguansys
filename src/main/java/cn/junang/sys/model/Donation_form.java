package cn.junang.sys.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Donation_form {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column donation_form.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column donation_form.don_name
     *
     * @mbg.generated
     */
    private String donName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column donation_form.don_supplies
     *
     * @mbg.generated
     */
    private String donSupplies;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column donation_form.classification
     *
     * @mbg.generated
     */
    private String classification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column donation_form.spe_model
     *
     * @mbg.generated
     */
    private String speModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column donation_form.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column donation_form.don_data
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date donData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column donation_form.id
     *
     * @return the value of donation_form.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column donation_form.id
     *
     * @param id the value for donation_form.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column donation_form.don_name
     *
     * @return the value of donation_form.don_name
     *
     * @mbg.generated
     */
    public String getDonName() {
        return donName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column donation_form.don_name
     *
     * @param donName the value for donation_form.don_name
     *
     * @mbg.generated
     */
    public void setDonName(String donName) {
        this.donName = donName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column donation_form.don_supplies
     *
     * @return the value of donation_form.don_supplies
     *
     * @mbg.generated
     */
    public String getDonSupplies() {
        return donSupplies;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column donation_form.don_supplies
     *
     * @param donSupplies the value for donation_form.don_supplies
     *
     * @mbg.generated
     */
    public void setDonSupplies(String donSupplies) {
        this.donSupplies = donSupplies;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column donation_form.classification
     *
     * @return the value of donation_form.classification
     *
     * @mbg.generated
     */
    public String getClassification() {
        return classification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column donation_form.classification
     *
     * @param classification the value for donation_form.classification
     *
     * @mbg.generated
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column donation_form.spe_model
     *
     * @return the value of donation_form.spe_model
     *
     * @mbg.generated
     */
    public String getSpeModel() {
        return speModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column donation_form.spe_model
     *
     * @param speModel the value for donation_form.spe_model
     *
     * @mbg.generated
     */
    public void setSpeModel(String speModel) {
        this.speModel = speModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column donation_form.quantity
     *
     * @return the value of donation_form.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column donation_form.quantity
     *
     * @param quantity the value for donation_form.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column donation_form.don_data
     *
     * @return the value of donation_form.don_data
     *
     * @mbg.generated
     */
    public Date getDonData() {
        return donData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column donation_form.don_data
     *
     * @param donData the value for donation_form.don_data
     *
     * @mbg.generated
     */
    public void setDonData(Date donData) {
        this.donData = donData;
    }
}