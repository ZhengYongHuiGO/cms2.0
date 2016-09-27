package com.otryin.cms.constant;

import java.util.UUID;

/**
 * Created by Administrator on 2016/2/23.
 */
public class ImageName {
    public static String getImageName(String originalName){
        String newName=originalName.substring(originalName.indexOf("."));
        String imageName= UUID.randomUUID().toString()+newName;
        return imageName;
    }
    public static String getImageName(){
        return UUID.randomUUID().toString();
    }
}
