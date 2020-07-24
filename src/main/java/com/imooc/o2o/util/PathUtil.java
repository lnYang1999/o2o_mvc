package com.imooc.o2o.util;

/**
 * @project: o2o
 * @description: 路径工具类，
 * 提供两类的路径-依据执行环境的不同提供不同的根路径（项目的所有图片所需要存放的路径）
 * @author: ysp
 * @create: 2020/07/22
 */
public class PathUtil {
    private static String separator = System.getProperty("file.separator");

    public static String getImgBasePath(){
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")){
            basePath = "D:/projectdev/image/";
        }else {
            basePath = "/home/image/";
        }
        basePath = basePath.replace("/",separator);
        return basePath;
    }

    public static String getShopImagePath(long shopId){
        String imagePath = "upload/item/shop/" + shopId + "/";
        return imagePath.replace("/",separator);
    }
}
