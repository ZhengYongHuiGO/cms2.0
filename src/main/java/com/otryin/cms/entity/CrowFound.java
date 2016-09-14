package com.otryin.cms.entity;



import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class CrowFound implements Serializable {
    private int id;
    private Date publishTime;
    private Date beginTime;
    //样品众筹目标人数
    private int sampleTargetJoinNum;
    //成品众筹目标人数
    private int productTargetJoinNum;
    //样品众筹当前人数
    private int sampleCurrentJoinNum;
    //成品众筹当前人数
    private int productCurrentJoinNum;
    private double sampleTargetAmount;
    private double productTargetAmount;
    private double sampleCurrentRaiseAmount=0;
    private double productCurrentRaiseAmount=0;
    private String designImage;
    private String information;
    private int participation;
    private String projectName;
    //private String stateImgUrl;
    private int crowFoundState;
    private int designerId;
    private int filmId;
    private int publishId;
    private int thumbsUp;
    //项目预热周期
    private int preheatPeriod;
    //项目样品期
    private int samplePeriod;
    //项目产品期
    private int productPeriod;
    //上传时间
    private Date uploadTime;
    //审核意见
    private String advice;
    //产品分类
    private String crowfoundClassification;
    //价格
    private int price;

    private double voucherNum;
    private int recommendState=0;
    //增加状态标识出只在互动处显示，不在首页显示
    private int supplyState=0;
    private int thumbsNum;

    //设计师
    private User designer;
    //电影
    private Film film;
    //项目banner图
    private List<CrowFoundBannerImage> crowFoundBannerImageList;
    //项目详情图
    private List<CrowFoundDetailImage> crowFoundDetailImageList;
    //套餐信息
    private List<Package> packageList;

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getParticipation() {
        return participation;
    }

    public void setParticipation(int participation) {
        this.participation = participation;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public double getSampleCurrentRaiseAmount() {
        return sampleCurrentRaiseAmount;
    }

    public void setSampleCurrentRaiseAmount(double sampleCurrentRaiseAmount) {
        this.sampleCurrentRaiseAmount = sampleCurrentRaiseAmount;
    }
    public double getProductCurrentRaiseAmount() {
        return productCurrentRaiseAmount;
    }

    public void setProductCurrentRaiseAmount(double productCurrentRaiseAmount) {
        this.productCurrentRaiseAmount = productCurrentRaiseAmount;
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
    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
    public int getPublishId() {
        return publishId;
    }

    public void setPublishId(int publishId) {
        this.publishId = publishId;
    }
    public int getThumbsUp() {
        return thumbsUp;
    }

    public void setThumbsUp(int thumbsUp) {
        this.thumbsUp = thumbsUp;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCrowFoundState() {
        return crowFoundState;
    }

    public void setCrowFoundState(int crowFoundState) {
        this.crowFoundState = crowFoundState;
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
    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
    public String  getCrowfoundClassification() {
        return crowfoundClassification;
    }

    public void setCrowfoundClassification(String crowfoundClassification) {
        this.crowfoundClassification = crowfoundClassification;
    }


    public double getVoucherNum() {
        return voucherNum;
    }

    public void setVoucherNum(double voucherNum) {
        this.voucherNum = voucherNum;
    }
    public int getSupplyState() {
        return supplyState;
    }

    public void setSupplyState(int supplyState) {
        this.supplyState = supplyState;
    }
    public int getRecommendState() {
        return recommendState;
    }

    public void setRecommendState(int recommendState) {
        this.recommendState = recommendState;
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
    public int getSampleCurrentJoinNum() {
        return sampleCurrentJoinNum;
    }
    public void setSampleCurrentJoinNum(int sampleCurrentJoinNum) {
        this.sampleCurrentJoinNum = sampleCurrentJoinNum;
    }
    public int getProductCurrentJoinNum() {
        return productCurrentJoinNum;
    }

    public void setProductCurrentJoinNum(int productCurrentJoinNum) {
        this.productCurrentJoinNum = productCurrentJoinNum;
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

    public List<CrowFoundBannerImage> getCrowFoundBannerImageList() {
        return crowFoundBannerImageList;
    }

    public void setCrowFoundBannerImageList(List<CrowFoundBannerImage> crowFoundBannerImageList) {
        this.crowFoundBannerImageList = crowFoundBannerImageList;
    }

    public List<CrowFoundDetailImage> getCrowFoundDetailImageList() {
        return crowFoundDetailImageList;
    }

    public void setCrowFoundDetailImageList(List<CrowFoundDetailImage> crowFoundDetailImageList) {
        this.crowFoundDetailImageList = crowFoundDetailImageList;
    }

    public List<Package> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<Package> packageList) {
        this.packageList = packageList;
    }

    @Override
    public String toString() {
        return "CrowFound{" +
                "id=" + id +
                ", beginTime=" + beginTime +
                ", projectName='" + projectName + '\'' +
                ", film=" + film +
                ", designer=" + designer +
                ", crowFoundBannerImageList=" + crowFoundBannerImageList +
                ", crowFoundDetailImageList=" + crowFoundDetailImageList +
                ", packageList=" + packageList +
                '}';
    }
}
