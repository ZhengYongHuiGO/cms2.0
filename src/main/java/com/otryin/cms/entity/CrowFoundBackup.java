package com.otryin.cms.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class CrowFoundBackup implements Serializable{
    private int id;
    private Date publishTime;
    private Date beginTime;
    private double sampleTargetAmount;
    private double productTargetAmount;
    private String designImage;
    private String information;
    //private int participation;
    private String projectName;
   //private double currentRaiseAmount;
    private int crowFoundState;
    private int designerId;
    private int filmId;
    private int publishId;
    //private int thumbsUp;
    private int preheatPeriod;
    private int samplePeriod;
    private int productPeriod;
    private Date uploadTime;
    private String advice;
    private String classification;
    private int price;

    //样品众筹目标人数
    private int sampleTargetJoinNum;
    //成品众筹目标人数
    private int productTargetJoinNum;
    private int thumbsNum;

    private User designer;
    private Film film;
    private List<CrowFoundBannerImageBackup> crowFoundBannerImageBackupList;
    private List<CrowFoundDetailImageBackup> crowFoundDetailImageBackupList;
    private List<PackageBackUp> packageBackUpList;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public double getSampleTargetAmount() {
        return sampleTargetAmount;
    }

    public void setSampleTargetAmount(double sampleTargetAmount) {
        this.sampleTargetAmount = sampleTargetAmount;
    }

    public double getProductTargetAmount() {
        return productTargetAmount;
    }

    public void setProductTargetAmount(double productTargetAmount) {
        this.productTargetAmount = productTargetAmount;
    }

    public String getDesignImage() {
        return designImage;
    }

    public void setDesignImage(String designImage) {
        this.designImage = designImage;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getCrowFoundState() {
        return crowFoundState;
    }

    public void setCrowFoundState(int crowFoundState) {
        this.crowFoundState = crowFoundState;
    }

    public int getDesignerId() {
        return designerId;
    }

    public void setDesignerId(int designerId) {
        this.designerId = designerId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getPublishId() {
        return publishId;
    }

    public void setPublishId(int publishId) {
        this.publishId = publishId;
    }

    public int getPreheatPeriod() {
        return preheatPeriod;
    }

    public void setPreheatPeriod(int preheatPeriod) {
        this.preheatPeriod = preheatPeriod;
    }

    public int getSamplePeriod() {
        return samplePeriod;
    }

    public void setSamplePeriod(int samplePeriod) {
        this.samplePeriod = samplePeriod;
    }

    public int getProductPeriod() {
        return productPeriod;
    }

    public void setProductPeriod(int productPeriod) {
        this.productPeriod = productPeriod;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSampleTargetJoinNum() {
        return sampleTargetJoinNum;
    }

    public void setSampleTargetJoinNum(int sampleTargetJoinNum) {
        this.sampleTargetJoinNum = sampleTargetJoinNum;
    }

    public int getProductTargetJoinNum() {
        return productTargetJoinNum;
    }

    public void setProductTargetJoinNum(int productTargetJoinNum) {
        this.productTargetJoinNum = productTargetJoinNum;
    }

    public int getThumbsNum() {
        return thumbsNum;
    }

    public void setThumbsNum(int thumbsNum) {
        this.thumbsNum = thumbsNum;
    }

    public User getDesigner() {
        return designer;
    }

    public void setDesigner(User designer) {
        this.designer = designer;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public List<CrowFoundBannerImageBackup> getCrowFoundBannerImageBackupList() {
        return crowFoundBannerImageBackupList;
    }

    public void setCrowFoundBannerImageBackupList(List<CrowFoundBannerImageBackup> crowFoundBannerImageBackupList) {
        this.crowFoundBannerImageBackupList = crowFoundBannerImageBackupList;
    }

    public List<CrowFoundDetailImageBackup> getCrowFoundDetailImageBackupList() {
        return crowFoundDetailImageBackupList;
    }

    public void setCrowFoundDetailImageBackupList(List<CrowFoundDetailImageBackup> crowFoundDetailImageBackupList) {
        this.crowFoundDetailImageBackupList = crowFoundDetailImageBackupList;
    }

    public List<PackageBackUp> getPackageBackUpList() {
        return packageBackUpList;
    }

    public void setPackageBackUpList(List<PackageBackUp> packageBackUpList) {
        this.packageBackUpList = packageBackUpList;
    }

    @Override
    public String toString() {
        return "CrowFoundBackup{" +
                "id=" + id +
                ", productPeriod=" + productPeriod +
                ", projectName='" + projectName + '\'' +
                ", productTargetJoinNum=" + productTargetJoinNum +
                ", film=" + film +
                ", designer=" + designer +
                ", crowFoundBannerImageBackupList=" + crowFoundBannerImageBackupList +
                ", crowFoundDetailImageBackupList=" + crowFoundDetailImageBackupList +
                ", packageBackUpList=" + packageBackUpList +
                '}';
    }
}
