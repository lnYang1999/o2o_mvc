package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;

import java.util.List;

/**
 * @author: ysp
 * @createTime: 2020/7/23 11:23
 */
public interface AreaDao {
    /**
     * @author: ysp
     * @description: 列出区域列表
     * @createTime: 2020/7/21 10:16
     *
     * @return java.util.List<com.imooc.o2o.entity.Area>
     */
    List<Area> queryArea();
}
