package com.otryin.cms.entity;

import java.io.Serializable;
import java.util.Date;



public class Banner implements Serializable{
    private int id;
    private Date publishTime;
    private String bannerImageUrl;
    private String bannerContentUrl;
    private int crowFoundId;
    private int goodsId;

    private Goods goods;
    private CrowFound crowFound;

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

    public String getBannerImageUrl() {
        return bannerImageUrl;
    }

    public void setBannerImageUrl(String bannerImageUrl) {
        this.bannerImageUrl = bannerImageUrl;
    }

    public CrowFound getCrowFound() {
        return crowFound;
    }

    public void setCrowFound(CrowFound crowFound) {
        this.crowFound = crowFound;
    }

    public String getBannerContentUrl() {
        return bannerContentUrl;
    }

    public void setBannerContentUrl(String bannerContentUrl) {
        this.bannerContentUrl = bannerContentUrl;
    }

    public int getCrowFoundId() {
        return crowFoundId;
    }

    public void setCrowFoundId(int crowFoundId) {
        this.crowFoundId = crowFoundId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", publishTime=" + publishTime +
                ", bannerImageUrl='" + bannerImageUrl + '\'' +
                ", crowFound=" + crowFound +
                '}';
    }
}
