package com.otryin.cms.entity;


import java.util.Date;

/**
 * Created by Administrator on 2016/8/25.
 */

public class Goods {

    private int id;
    private int goodsState;
    private int price;
    //当前购买人数
    private int payNum;
    //已售数目
    private int saleNum;
    //商品名称
    private String goodsName;
    //商品描述
    private String goodsDescribe;
    //附加信息
    private String appendInfo;
    //商品标签 例如 新品-爆款
    private String tags;
    //商品首页展示图
    private String homeImageUrl;
    //商品的详细参数    例如：货号：K134-适用对象：青年
    private String goodsParameters;
    //商品可以享受的服务 例如：极速退货 正品保证 商品服务的id 1-2-3 拼接
    private String goodsServices;
    private Date uploadTime;
    private String classification;
    private int filmId;
    //上架时间 审核成功即上架
    private Date onShelfTime;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    public String getAppendInfo() {
        return appendInfo;
    }

    public void setAppendInfo(String appendInfo) {
        this.appendInfo = appendInfo;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getHomeImageUrl() {
        return homeImageUrl;
    }

    public void setHomeImageUrl(String homeImageUrl) {
        this.homeImageUrl = homeImageUrl;
    }

    public String getGoodsParameters() {
        return goodsParameters;
    }

    public void setGoodsParameters(String goodsParameters) {
        this.goodsParameters = goodsParameters;
    }

    public String getGoodsServices() {
        return goodsServices;
    }

    public void setGoodsServices(String goodsServices) {
        this.goodsServices = goodsServices;
    }

    public int getPayNum() {
        return payNum;
    }

    public void setPayNum(int payNum) {
        this.payNum = payNum;
    }

    public int getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(int goodsState) {
        this.goodsState = goodsState;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public Date getOnShelfTime() {
        return onShelfTime;
    }

    public void setOnShelfTime(Date onShelfTime) {
        this.onShelfTime = onShelfTime;
    }
}
