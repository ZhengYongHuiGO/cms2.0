package com.otryin.cms.entity;

import java.io.Serializable;


public class PackageBackUp implements Serializable {

    private int id;
    private int price;
    private int packamount;
    private String packname;
    private String packdescription;
    private String imageUrl;
    private int packpostage;
    private int crowfoundId;
    private int truePostage=0;

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

    public int getTruePostage() {
        return truePostage;
    }

    public void setTruePostage(int truePostage) {
        this.truePostage = truePostage;
    }

    @Override
    public String toString() {
        return "PackageBackUp{" +
                "packdescription='" + packdescription + '\'' +
                ", packname='" + packname + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
