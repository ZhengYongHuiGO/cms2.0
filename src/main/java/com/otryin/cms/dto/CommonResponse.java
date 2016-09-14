package com.otryin.cms.dto;

/**
 * Created by Administrator on 2016/9/14.
 */
public class CommonResponse<T> {
    private int resultCode;
    private String resultInfo;
    private T t;

    public CommonResponse(T t) {
        this.resultCode=1000;
        this.resultInfo="ok";
        this.t = t;
    }

    public CommonResponse(int resultCode, String resultInfo, T t) {
        this.resultCode = resultCode;
        this.resultInfo = resultInfo;
        this.t = t;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
