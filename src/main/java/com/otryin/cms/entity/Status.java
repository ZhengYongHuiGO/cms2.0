package com.otryin.cms.entity;


import java.io.Serializable;


public class Status implements Serializable{


    private int id;
    private int status;
    private int userId;
    private int statusGrade;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public int getStatusGrade() {
        return statusGrade;
    }

    public void setStatusGrade(int statusGrade) {
        this.statusGrade = statusGrade;
    }
}
