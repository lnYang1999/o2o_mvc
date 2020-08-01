package com.imooc.o2o.util;

import com.imooc.o2o.dto.ImageHolder;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @project: o2o
 * @description: 封装Thumbnailator的底层服务类
 * @author: ysp
 * @create: 2020/07/22
 */
public class ImageUtil {
    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//    private static String basePath = "F:/IdeaProject/o2o/src/main/resources";

    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();
    private static Logger logger = LoggerFactory.getLogger(ImageUtil.class);

    /**
     * @author: ysp
     * @description: 将CommonsMultipartFile转换成File类
     * @createTime: 2020/7/22 17:36
     *
     * @return java.io.File
     */
    public static File transferCommonsMultipartFileToFile(CommonsMultipartFile cFile){
        File newFile = new File(cFile.getOriginalFilename());
        try {
            cFile.transferTo(newFile);
        } catch (IOException e) {
            logger.error(e.toString());
            e.printStackTrace();
        }
        return newFile;
    }
    
    /**
     * @author: ysp
     * @description: 处理缩略图，并返回新生成图片的相对值路径
     * @createTime: 2020/7/22 13:42
     *
     * @return java.lang.String
     */
    public static String generateThumbnail(ImageHolder thumbnail, String targetAddr){
        String realFileName = getRandomFileName();
        String extension = getFileExtension(thumbnail.getImageName());
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName +extension;
        logger.debug("current relativeAddr is :" + relativeAddr);
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        logger.debug("current complete addr is :" + PathUtil.getImgBasePath() + relativeAddr);
        try {
            Thumbnails.of(thumbnail.getImage()).size(200,200)
                    .watermark(Positions.BOTTOM_RIGHT,ImageIO.read(new File(basePath + "/watermark.jpg")),0.25f)
                    .outputQuality(0.8f).toFile(dest);
        }catch (IOException e){
            e.printStackTrace();
        }
        return relativeAddr;
    }

    /**
     * @author: ysp
     * @description: 生成随机文件名，当前年月日小时分钟秒钟+五位随机数
     * @createTime: 2020/7/22 12:54
     *
     * @return java.lang.String
     */
    public static String getRandomFileName() {
        //获取随机的五位数
        int ranNum = r.nextInt(89999)+10000;
        String nowTimeStr = sDateFormat.format(new Date());
        return nowTimeStr+ranNum;
    }

    /**
     * @author: ysp
     * @description: 获取输入文件流的扩展名（jpg.png...）
     * @createTime: 2020/7/22 13:12
     *
     * @return java.lang.String
     */
    private static String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }


    /**
     * @author: ysp
     * @description: 创建目标路径所涉及到的目录，即/home/work/ysp/xxx.jpg，
     * 那么home work ysp这三个文件夹都得自动创建
     * @createTime: 2020/7/22 13:17
     *
     * @return void
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()){
            dirPath.mkdirs();
        }
    }

    /**
     * @author: ysp
     * @description: storePath是文件的路径还是目录的路径，
     * 如果storePath是文件路径则删除该文件，
     * 如果storePath是目录路径则删除该目录下的所有文件
     * @createTime: 2020/7/24 10:44
     *
     * @param strorePath
     * @return void
     */
    public static void deleteFileOrPath(String strorePath){
        //获取全路径，路径有可能是目录路径，有可能是文件路径
        File fileOrPath = new File(PathUtil.getImgBasePath() + strorePath);
        if (fileOrPath.exists()){
            if (fileOrPath.isDirectory()){
                File files[] = fileOrPath.listFiles();
                for (int i =0; i < files.length; i++){
                    files[i].delete();
                }
            }
            fileOrPath.delete();
        }
    }

    /**
     * @author: ysp
     * @description:处理详情图，并返回新生成图片的相对值路径
     * @createTime: 2020/7/25 20:47
     *
     * @param thumbnail
     * @param targetAddr
     * @return java.lang.String
     */
    public static String generateNormalImg(ImageHolder thumbnail, String targetAddr) {
        // 获取不重复的随机名
        String realFileName = getRandomFileName();
        // 获取文件的扩展名如png,jpg等
        String extension = getFileExtension(thumbnail.getImageName());
        // 如果目标路径不存在，则自动创建
        makeDirPath(targetAddr);
        // 获取文件存储的相对路径(带文件名)
        String relativeAddr = targetAddr + realFileName + extension;
        logger.debug("current relativeAddr is :" + relativeAddr);
        // 获取文件要保存到的目标路径
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        logger.debug("current complete addr is :" + PathUtil.getImgBasePath() + relativeAddr);
        // 调用Thumbnails生成带有水印的图片
        try {
            Thumbnails.of(thumbnail.getImage()).size(337, 640)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
                    .outputQuality(0.9f).toFile(dest);
        } catch (IOException e) {
            logger.error(e.toString());
            throw new RuntimeException("创建缩图片失败：" + e.toString());
        }
        // 返回图片相对路径地址
        return relativeAddr;
    }

//    public static void main(String[] args) throws IOException {
//        System.out.println(basePath);
//        Thumbnails.of(new File("F:/慕课网学习/xiaohuangren.jpg"))
//                .size(200,200).watermark(Positions.BOTTOM_RIGHT,
//                ImageIO.read(new File(basePath + "/watermark.jpg")),0.25f)
//                .outputQuality(0.8f)
//                .toFile("F:/慕课网学习/xiaohuangrennew.jpg");
//    }


}
