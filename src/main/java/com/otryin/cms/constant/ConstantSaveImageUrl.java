package com.otryin.cms.constant;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/1/26.
 */
public class ConstantSaveImageUrl {
    public static String getDir(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMM/");
        return simpleDateFormat.format(new Date());
    }
    public static final String SAVEIMAGEIP="http://cms.otryin.com/images/";
    public static final String COPYURL="/usr/images/";
    public static String getSaveimageip(){
            return SAVEIMAGEIP+getDir();
    }
    public static String getCopyurl(){
            return COPYURL+getDir();
    }
}
