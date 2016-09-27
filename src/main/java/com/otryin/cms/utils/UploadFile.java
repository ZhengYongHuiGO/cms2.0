package com.otryin.cms.utils;

/**
 * Created by Administrator on 2015/12/25.
 */

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
/*MultipartFile类常用的一些方法：
        String getContentType() //获取文件MIME类型
        InputStream getInputStream() //返回文件流
        String getName() //获取表单中文件组件的名字
        String getOriginalFilename() //获取上传文件的原名
        long getSize() //获取文件的字节大小，单位byte
        boolean isEmpty() //是否为空
        void transferTo(File dest) //保存到一个目标文件中*/

/**
 * 上传图片
 *
 * @author Administrator
 *
 */

public class UploadFile {


    /***
     * 保存文件
     *
     * @param file
     * @return
     */
    public static boolean saveFile(MultipartFile file, String intentPath) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                File saveDir = new File(intentPath);
                if (!saveDir.getParentFile().exists())
                    saveDir.getParentFile().mkdirs();

                // 转存文件
                file.transferTo(saveDir);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }


}

