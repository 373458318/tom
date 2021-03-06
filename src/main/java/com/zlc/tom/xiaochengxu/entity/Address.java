package com.zlc.tom.xiaochengxu.entity;

import java.util.Date;

public class Address {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.link_man
     *
     * @mbggenerated
     */
    private String linkMan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.link_phone
     *
     * @mbggenerated
     */
    private String linkPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.link_province
     *
     * @mbggenerated
     */
    private String linkProvince;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.link_city
     *
     * @mbggenerated
     */
    private String linkCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.link_addr
     *
     * @mbggenerated
     */
    private String linkAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.default_addr
     *
     * @mbggenerated
     */
    private Boolean defaultAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.create_by
     *
     * @mbggenerated
     */
    private Long createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.update_by
     *
     * @mbggenerated
     */
    private Long updateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.enable
     *
     * @mbggenerated
     */
    private Boolean enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_address.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.id
     *
     * @return the value of wx_address.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.id
     *
     * @param id the value for wx_address.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.user_id
     *
     * @return the value of wx_address.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.user_id
     *
     * @param userId the value for wx_address.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.link_man
     *
     * @return the value of wx_address.link_man
     *
     * @mbggenerated
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.link_man
     *
     * @param linkMan the value for wx_address.link_man
     *
     * @mbggenerated
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.link_phone
     *
     * @return the value of wx_address.link_phone
     *
     * @mbggenerated
     */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.link_phone
     *
     * @param linkPhone the value for wx_address.link_phone
     *
     * @mbggenerated
     */
    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.link_province
     *
     * @return the value of wx_address.link_province
     *
     * @mbggenerated
     */
    public String getLinkProvince() {
        return linkProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.link_province
     *
     * @param linkProvince the value for wx_address.link_province
     *
     * @mbggenerated
     */
    public void setLinkProvince(String linkProvince) {
        this.linkProvince = linkProvince == null ? null : linkProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.link_city
     *
     * @return the value of wx_address.link_city
     *
     * @mbggenerated
     */
    public String getLinkCity() {
        return linkCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.link_city
     *
     * @param linkCity the value for wx_address.link_city
     *
     * @mbggenerated
     */
    public void setLinkCity(String linkCity) {
        this.linkCity = linkCity == null ? null : linkCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.link_addr
     *
     * @return the value of wx_address.link_addr
     *
     * @mbggenerated
     */
    public String getLinkAddr() {
        return linkAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.link_addr
     *
     * @param linkAddr the value for wx_address.link_addr
     *
     * @mbggenerated
     */
    public void setLinkAddr(String linkAddr) {
        this.linkAddr = linkAddr == null ? null : linkAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.default_addr
     *
     * @return the value of wx_address.default_addr
     *
     * @mbggenerated
     */
    public Boolean getDefaultAddr() {
        return defaultAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.default_addr
     *
     * @param defaultAddr the value for wx_address.default_addr
     *
     * @mbggenerated
     */
    public void setDefaultAddr(Boolean defaultAddr) {
        this.defaultAddr = defaultAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.create_by
     *
     * @return the value of wx_address.create_by
     *
     * @mbggenerated
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.create_by
     *
     * @param createBy the value for wx_address.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.create_time
     *
     * @return the value of wx_address.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.create_time
     *
     * @param createTime the value for wx_address.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.update_by
     *
     * @return the value of wx_address.update_by
     *
     * @mbggenerated
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.update_by
     *
     * @param updateBy the value for wx_address.update_by
     *
     * @mbggenerated
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.update_time
     *
     * @return the value of wx_address.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.update_time
     *
     * @param updateTime the value for wx_address.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.enable
     *
     * @return the value of wx_address.enable
     *
     * @mbggenerated
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.enable
     *
     * @param enable the value for wx_address.enable
     *
     * @mbggenerated
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_address.remark
     *
     * @return the value of wx_address.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_address.remark
     *
     * @param remark the value for wx_address.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}