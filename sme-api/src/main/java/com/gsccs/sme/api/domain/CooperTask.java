package com.gsccs.sme.api.domain;

import java.util.Date;

public class CooperTask {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_coopertask.id
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_coopertask.flowid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private Long flowid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_coopertask.assignerid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private Long assignerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_coopertask.status
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_coopertask.content
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_coopertask.addtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_coopertask.endtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private Date endtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_coopertask.id
     *
     * @return the value of sme_coopertask.id
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_coopertask.id
     *
     * @param id the value for sme_coopertask.id
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_coopertask.flowid
     *
     * @return the value of sme_coopertask.flowid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public Long getFlowid() {
        return flowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_coopertask.flowid
     *
     * @param flowid the value for sme_coopertask.flowid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_coopertask.assignerid
     *
     * @return the value of sme_coopertask.assignerid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public Long getAssignerid() {
        return assignerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_coopertask.assignerid
     *
     * @param assignerid the value for sme_coopertask.assignerid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setAssignerid(Long assignerid) {
        this.assignerid = assignerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_coopertask.status
     *
     * @return the value of sme_coopertask.status
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_coopertask.status
     *
     * @param status the value for sme_coopertask.status
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_coopertask.content
     *
     * @return the value of sme_coopertask.content
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_coopertask.content
     *
     * @param content the value for sme_coopertask.content
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_coopertask.addtime
     *
     * @return the value of sme_coopertask.addtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_coopertask.addtime
     *
     * @param addtime the value for sme_coopertask.addtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_coopertask.endtime
     *
     * @return the value of sme_coopertask.endtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_coopertask.endtime
     *
     * @param endtime the value for sme_coopertask.endtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}