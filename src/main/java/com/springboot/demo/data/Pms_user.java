package com.springboot.demo.data;

import java.math.BigDecimal;
import java.util.Date;
/*
* 根据数据库字段创建
* 其中：用户登录名（UUID）、用户真实名称（realname）、用户性别（user_sex）、最后登录时间（last_login_time）
* user_sex,status,is_superman,is_teamleader用1和0来表示*/
public class Pms_user {
    private String uuid;
    private String user_pass;
    private String realname;
    private BigDecimal user_sex;
    private String user_org;
    private String telephone;
    private String mobile;
    private String email;
    private BigDecimal status;
    private Date last_login_time;
    private BigDecimal is_superman;
    private String position;
    private BigDecimal is_teamleader;

    public String getUuid() {
        return uuid;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public String getRealname() {
        return realname;
    }

    public BigDecimal getUser_sex() {
        return user_sex;
    }

    public String getUser_org() {
        return user_org;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public BigDecimal getIs_superman() {
        return is_superman;
    }

    public String getPosition() {
        return position;
    }

    public BigDecimal getIs_teamleader() {
        return is_teamleader;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setUser_sex(BigDecimal user_sex) {
        this.user_sex = user_sex;
    }

    public void setUser_org(String user_org) {
        this.user_org = user_org;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public void setIs_superman(BigDecimal is_superman) {
        this.is_superman = is_superman;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setIs_teamleader(BigDecimal is_teamleader) {
        this.is_teamleader = is_teamleader;
    }

    @Override
    public String toString() {
        return "Pms_user{" +
                "uuid='" + uuid + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", realname='" + realname + '\'' +
                ", user_sex=" + user_sex +
                ", user_org='" + user_org + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", last_login_time=" + last_login_time +
                ", is_superman=" + is_superman +
                ", position='" + position + '\'' +
                ", is_teamleader=" + is_teamleader +
                '}';
    }
}
