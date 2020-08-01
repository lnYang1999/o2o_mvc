package com.imooc.o2o.service;

import com.imooc.o2o.entity.HeadLine;

import java.io.IOException;
import java.util.List;

public interface HeadLineService {
    public static final String HLLISTKEY = "headlinelist";

    /**
     * @author: ysp
     * @description: 根据传入的条件返回指定的头条列表
     * @createTime: 2020/7/27 9:59
     *
     * @param headLineCondition
     * @return java.util.List<com.imooc.o2o.entity.HeadLine>
     */
    List<HeadLine> getHeadLineList(HeadLine headLineCondition) throws IOException;

//    /**
//     * 添加头条信息，并存储头条图片
//     *
//     * @param headLine
//     * @param thumbnail
//     * @return
//     */
//    HeadLineExecution addHeadLine(HeadLine headLine, ImageHolder thumbnail);
//
//    /**
//     * 修改头条信息
//     *
//     * @param headLine
//     * @param thumbnail
//     * @return
//     */
//    HeadLineExecution modifyHeadLine(HeadLine headLine, ImageHolder thumbnail);
//
//    /**
//     * 删除单条头条
//     *
//     * @param headLineId
//     * @return
//     */
//    HeadLineExecution removeHeadLine(long headLineId);
//
//    /**
//     * 批量删除头条
//     *
//     * @param headLineIdList
//     * @return
//     */
//    HeadLineExecution removeHeadLineList(List<Long> headLineIdList);
}
