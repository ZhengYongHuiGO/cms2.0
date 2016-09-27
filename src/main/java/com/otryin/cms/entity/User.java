package com.otryin.cms.entity;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable{
    private int id;
    private String nickName;
    private String iconUrl;
    private String iconUrl2;
    private Date birthday;
    private String sex;
    private String bloodType;
    private String birthPlace;
    private String currentPlace;
    private String introduction;
    private String hobby;
    private String label;
    private double balance;
    private String sexPrefer;
    private String relationshipStatus;
    private String zodiac;
    private String contacts;
    private String address;
    private int age;
    private String constellation;
    private int userId;
    //用户状态 0：表示激活状态 1：表示冻结转态 默认为0
    private int userSate=0;
    private Date registTime;
    private int backgroundIndex;
    private String inviteCode;
    private String invitedCode;
    private int secretKeyAmount;
    private int hasNewPush;
    private String pushStatus;
    //是否是首次下单 默认是 1是首次下单
    private int firstOrder=1;

    private UserAccount userAccount;
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getIconUrl2() {
        return iconUrl2;
    }

    public void setIconUrl2(String iconUrl2) {
        this.iconUrl2 = iconUrl2;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(String currentPlace) {
        this.currentPlace = currentPlace;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSexPrefer() {
        return sexPrefer;
    }

    public void setSexPrefer(String sexPrefer) {
        this.sexPrefer = sexPrefer;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserSate() {
        return userSate;
    }

    public void setUserSate(int userSate) {
        this.userSate = userSate;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public int getBackgroundIndex() {
        return backgroundIndex;
    }

    public void setBackgroundIndex(int backgroundIndex) {
        this.backgroundIndex = backgroundIndex;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getInvitedCode() {
        return invitedCode;
    }

    public void setInvitedCode(String invitedCode) {
        this.invitedCode = invitedCode;
    }

    public int getSecretKeyAmount() {
        return secretKeyAmount;
    }

    public void setSecretKeyAmount(int secretKeyAmount) {
        this.secretKeyAmount = secretKeyAmount;
    }

    public int getHasNewPush() {
        return hasNewPush;
    }

    public void setHasNewPush(int hasNewPush) {
        this.hasNewPush = hasNewPush;
    }

    public String getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(String pushStatus) {
        this.pushStatus = pushStatus;
    }

    public int getFirstOrder() {
        return firstOrder;
    }

    public void setFirstOrder(int firstOrder) {
        this.firstOrder = firstOrder;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
