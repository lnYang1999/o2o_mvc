package com.imooc.o2o.service.impl;

import com.imooc.o2o.dao.HeadLineDao;
import com.imooc.o2o.entity.HeadLine;
import com.imooc.o2o.service.HeadLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @project: o2o
 * @description: HeadLineService实现类
 * @author: ysp
 * @create: 2020/07/27
 */
@Service
public class HeadLineServiceImpl implements HeadLineService {
    @Autowired
    private HeadLineDao headLineDao;

    /**
     * @param headLineCondition
     * @return java.util.List<com.imooc.o2o.entity.HeadLine>
     * @author: ysp
     * @description: 根据传入的条件返回指定的头条列表
     * @createTime: 2020/7/27 9:59
     */
    @Override
    public List<HeadLine> getHeadLineList(HeadLine headLineCondition) {
        return headLineDao.queryHeadLine(headLineCondition);
    }
}
