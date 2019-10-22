package com.zlc.tom.xiaochengxu.entity;

public class Area {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_area.areaId
     *
     * @mbggenerated
     */
    private Integer areaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_area.areaCode
     *
     * @mbggenerated
     */
    private String areacode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_area.areaName
     *
     * @mbggenerated
     */
    private String areaname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_area.level
     *
     * @mbggenerated
     */
    private Byte level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_area.cityCode
     *
     * @mbggenerated
     */
    private String citycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_area.center
     *
     * @mbggenerated
     */
    private String center;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_area.parentId
     *
     * @mbggenerated
     */
    private Integer parentid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_area.areaId
     *
     * @return the value of wx_area.areaId
     *
     * @mbggenerated
     */
    public Integer getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_area.areaId
     *
     * @param areaid the value for wx_area.areaId
     *
     * @mbggenerated
     */
    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_area.areaCode
     *
     * @return the value of wx_area.areaCode
     *
     * @mbggenerated
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_area.areaCode
     *
     * @param areacode the value for wx_area.areaCode
     *
     * @mbggenerated
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_area.areaName
     *
     * @return the value of wx_area.areaName
     *
     * @mbggenerated
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_area.areaName
     *
     * @param areaname the value for wx_area.areaName
     *
     * @mbggenerated
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_area.level
     *
     * @return the value of wx_area.level
     *
     * @mbggenerated
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_area.level
     *
     * @param level the value for wx_area.level
     *
     * @mbggenerated
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_area.cityCode
     *
     * @return the value of wx_area.cityCode
     *
     * @mbggenerated
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_area.cityCode
     *
     * @param citycode the value for wx_area.cityCode
     *
     * @mbggenerated
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_area.center
     *
     * @return the value of wx_area.center
     *
     * @mbggenerated
     */
    public String getCenter() {
        return center;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_area.center
     *
     * @param center the value for wx_area.center
     *
     * @mbggenerated
     */
    public void setCenter(String center) {
        this.center = center == null ? null : center.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_area.parentId
     *
     * @return the value of wx_area.parentId
     *
     * @mbggenerated
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_area.parentId
     *
     * @param parentid the value for wx_area.parentId
     *
     * @mbggenerated
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}