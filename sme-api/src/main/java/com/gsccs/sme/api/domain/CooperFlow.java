package com.gsccs.sme.api.domain;

import java.util.Date;

public class CooperFlow {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_cooperflow.id
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_cooperflow.title
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_cooperflow.createrid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private Long createrid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_cooperflow.targetids
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private String targetids;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_cooperflow.content
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_cooperflow.addtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_cooperflow.status
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_cooperflow.id
     *
     * @return the value of sme_cooperflow.id
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_cooperflow.id
     *
     * @param id the value for sme_cooperflow.id
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_cooperflow.title
     *
     * @return the value of sme_cooperflow.title
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_cooperflow.title
     *
     * @param title the value for sme_cooperflow.title
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_cooperflow.createrid
     *
     * @return the value of sme_cooperflow.createrid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public Long getCreaterid() {
        return createrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_cooperflow.createrid
     *
     * @param createrid the value for sme_cooperflow.createrid
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setCreaterid(Long createrid) {
        this.createrid = createrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_cooperflow.targetids
     *
     * @return the value of sme_cooperflow.targetids
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public String getTargetids() {
        return targetids;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_cooperflow.targetids
     *
     * @param targetids the value for sme_cooperflow.targetids
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setTargetids(String targetids) {
        this.targetids = targetids == null ? null : targetids.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_cooperflow.content
     *
     * @return the value of sme_cooperflow.content
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_cooperflow.content
     *
     * @param content the value for sme_cooperflow.content
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_cooperflow.addtime
     *
     * @return the value of sme_cooperflow.addtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_cooperflow.addtime
     *
     * @param addtime the value for sme_cooperflow.addtime
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_cooperflow.status
     *
     * @return the value of sme_cooperflow.status
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_cooperflow.status
     *
     * @param status the value for sme_cooperflow.status
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}