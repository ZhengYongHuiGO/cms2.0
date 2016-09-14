package com.otryin.cms.entity;

import java.io.Serializable;


public class CrowFoundBannerImage implements Serializable{
    private int id;
    private int crowFoundId;
    private int crowFoundState;
    private String crowfoundBannerImageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCrowFoundId() {
        return crowFoundId;
    }

    public void setCrowFoundId(int crowFoundId) {
        this.crowFoundId = crowFoundId;
    }

    public int getCrowFoundState() {
        return crowFoundState;
    }

    public void setCrowFoundState(int crowFoundState) {
        this.crowFoundState = crowFoundState;
    }

    public String getCrowfoundBannerImageUrl() {
        return crowfoundBannerImageUrl;
    }

    public void setCrowfoundBannerImageUrl(String crowfoundBannerImageUrl) {
        this.crowfoundBannerImageUrl = crowfoundBannerImageUrl;
    }

    @Override
    public String toString() {
        return "CrowFoundBannerImage{" +
                "crowfoundBannerImageUrl='" + crowfoundBannerImageUrl + '\'' +
                '}';
    }
}
