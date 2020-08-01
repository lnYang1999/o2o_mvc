package com.imooc.o2o.util;

/**
 * @project: o2o
 * @description: 路径工具类，
 * 提供两类的路径-依据执行环境的不同提供不同的根路径（项目的所有图片所需要存放的路径）
 * @author: ysp
 * @create: 2020/07/22
 */
public class PathUtil {
    private static String seperator = System.getProperty("file.separator");

    public static String getImgBasePath(){
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")){
            basePath = "D:/projectdev/image";
        }else {
            basePath = "/Users/work/image";
        }
        basePath = basePath.replace("/",seperator);
        return basePath;
    }

    public static String getShopImagePath(long shopId){
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/",seperator);
    }
    public static String getHeadLineImagePath() {
        String imagePath = "/upload/images/item/headtitle/";
        return imagePath.replace("/", seperator);
    }
    public static String getShopCategoryPath() {
        String imagePath = "/upload/images/item/shopcategory/";
        return imagePath.replace("/", seperator);
    }
}
