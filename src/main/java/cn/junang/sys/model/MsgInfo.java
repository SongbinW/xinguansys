package cn.junang.sys.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MsgInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.msg_Title
     *
     * @mbg.generated
     */
    private String msgTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.receiver
     *
     * @mbg.generated
     */
    private String receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.msg_Content
     *
     * @mbg.generated
     */
    private String msgContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.frequency
     *
     * @mbg.generated
     */
    private Integer frequency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.sendtime
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sendtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.Remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.id
     *
     * @return the value of msg_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.id
     *
     * @param id the value for msg_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.msg_Title
     *
     * @return the value of msg_info.msg_Title
     *
     * @mbg.generated
     */
    public String getMsgTitle() {
        return msgTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.msg_Title
     *
     * @param msgTitle the value for msg_info.msg_Title
     *
     * @mbg.generated
     */
    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.receiver
     *
     * @return the value of msg_info.receiver
     *
     * @mbg.generated
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.receiver
     *
     * @param receiver the value for msg_info.receiver
     *
     * @mbg.generated
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.msg_Content
     *
     * @return the value of msg_info.msg_Content
     *
     * @mbg.generated
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.msg_Content
     *
     * @param msgContent the value for msg_info.msg_Content
     *
     * @mbg.generated
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.frequency
     *
     * @return the value of msg_info.frequency
     *
     * @mbg.generated
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.frequency
     *
     * @param frequency the value for msg_info.frequency
     *
     * @mbg.generated
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.status
     *
     * @return the value of msg_info.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.status
     *
     * @param status the value for msg_info.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.sendtime
     *
     * @return the value of msg_info.sendtime
     *
     * @mbg.generated
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.sendtime
     *
     * @param sendtime the value for msg_info.sendtime
     *
     * @mbg.generated
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.Remark
     *
     * @return the value of msg_info.Remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.Remark
     *
     * @param remark the value for msg_info.Remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}