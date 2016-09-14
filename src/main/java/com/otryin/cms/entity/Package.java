package com.otryin.cms.entity;

import java.io.Serializable;


public class Package implements Serializable {

    private int id;
    private int price;
    private int packamount;
    private String packname;
    private String packdescription;
    private String imageUrl;
    private int packpostage;
    private int crowfoundId;
    private int participation;
    private int truePostage=0;//1免邮 默认不免邮

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

    public int getPackamount() {
        return packamount;
    }

    public void setPackamount(int packamount) {
        this.packamount = packamount;
    }

    public String getPackname() {
        return packname;
    }

    public void setPackname(String packname) {
        this.packname = packname;
    }

    public String getPackdescription() {
        return packdescription;
    }

    public void setPackdescription(String packdescription) {
        this.packdescription = packdescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPackpostage() {
        return packpostage;
    }

    public void setPackpostage(int packpostage) {
        this.packpostage = packpostage;
    }

    public int getCrowfoundId() {
        return crowfoundId;
    }

    public void setCrowfoundId(int crowfoundId) {
        this.crowfoundId = crowfoundId;
    }

    public int getParticipation() {
        return participation;
    }

    public void setParticipation(int participation) {
        this.participation = participation;
    }

    public int getTruePostage() {
        return truePostage;
    }

    public void setTruePostage(int truePostage) {
        this.truePostage = truePostage;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", price=" + price +
                ", packamount=" + packamount +
                ", participation=" + participation +
                ", packname='" + packname + '\'' +
                ", packdescription='" + packdescription + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
