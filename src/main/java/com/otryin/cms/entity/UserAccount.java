package com.otryin.cms.entity;

import java.io.Serializable;
import java.util.Date;


public class UserAccount implements Serializable{

    private int id;
    private String userName;
    private String account;
    private String password;
    private String idCardNumber;
    private String phone;
    private String email;
    private Date sendDate;
    private int isActivated;
    private String checkCode;
    private String sinaUid;
    private String tencentUid;
    private String wxsessionUid;
    private String token;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public int getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(int isActivated) {
        this.isActivated = isActivated;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getSinaUid() {
        return sinaUid;
    }

    public void setSinaUid(String sinaUid) {
        this.sinaUid = sinaUid;
    }

    public String getTencentUid() {
        return tencentUid;
    }

    public void setTencentUid(String tencentUid) {
        this.tencentUid = tencentUid;
    }

    public String getWxsessionUid() {
        return wxsessionUid;
    }

    public void setWxsessionUid(String wxsessionUid) {
        this.wxsessionUid = wxsessionUid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
