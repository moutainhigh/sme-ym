package com.gsccs.sme.plat.site.model;

public class ContentAttachT {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_info_attach.id
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_info_attach.infoid
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    private Long infoid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_info_attach.filename
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    private String filename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_info_attach.filepath
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    private String filepath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_info_attach.filetype
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    private String filetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sme_info_attach.addtime
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    private String addtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_info_attach.id
     *
     * @return the value of sme_info_attach.id
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_info_attach.id
     *
     * @param id the value for sme_info_attach.id
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_info_attach.infoid
     *
     * @return the value of sme_info_attach.infoid
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public Long getInfoid() {
        return infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_info_attach.infoid
     *
     * @param infoid the value for sme_info_attach.infoid
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public void setInfoid(Long infoid) {
        this.infoid = infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_info_attach.filename
     *
     * @return the value of sme_info_attach.filename
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_info_attach.filename
     *
     * @param filename the value for sme_info_attach.filename
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_info_attach.filepath
     *
     * @return the value of sme_info_attach.filepath
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_info_attach.filepath
     *
     * @param filepath the value for sme_info_attach.filepath
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_info_attach.filetype
     *
     * @return the value of sme_info_attach.filetype
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_info_attach.filetype
     *
     * @param filetype the value for sme_info_attach.filetype
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sme_info_attach.addtime
     *
     * @return the value of sme_info_attach.addtime
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public String getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sme_info_attach.addtime
     *
     * @param addtime the value for sme_info_attach.addtime
     *
     * @mbggenerated Thu Mar 10 17:51:32 CST 2016
     */
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}