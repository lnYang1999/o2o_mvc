package com.imooc.o2o.util;

/**
 * @project: o2o
 * @description: 分页计算工具类
 * @author: ysp
 * @create: 2020/07/24
 */
public class PageCalculator {
    public static int calculateRowIndex(int pageIndex, int pageSize){
        //pageIndex是页码
        //页码值为1就表示的是选取第一页的数据，第一页如果它的pageSize等于5就是说一页有5条，就需要从第0条（rowIndex）开始，去选取5条数据，也就是选到第4条数据
        //如果pageIndex等于2，2就表示的是需要选择的是第二页的数据，第二页的数据就需要从（2-1）*5就是第5条数据开始选取
        return (pageIndex > 0) ? (pageIndex - 1) * pageSize : 0;
    }
}
