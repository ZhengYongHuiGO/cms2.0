package com.otryin.cms.entity;

public class CrowFoundDetailImage {
    private int id;
    private int crowFoundId;
    private String crowFoundDetailImageUrl;

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

    public String getCrowFoundDetailImageUrl() {
        return crowFoundDetailImageUrl;
    }

    public void setCrowFoundDetailImageUrl(String crowFoundDetailImageUrl) {
        this.crowFoundDetailImageUrl = crowFoundDetailImageUrl;
    }

    @Override
    public String toString() {
        return "CrowFoundDetailImage{" +
                "id=" + id +
                ", crowFoundDetailImageUrl='" + crowFoundDetailImageUrl + '\'' +
                '}';
    }
}
