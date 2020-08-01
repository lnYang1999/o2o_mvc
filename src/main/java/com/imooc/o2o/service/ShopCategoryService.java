package com.imooc.o2o.service;

import com.imooc.o2o.entity.ShopCategory;

import java.util.List;

public interface ShopCategoryService {
    /**
     * @author: ysp
     * @description: 根据查询条件获取shopCategory列表
     * @createTime: 2020/7/27 10:04
     *
     * @param shopCategoryCondition
     * @return java.util.List<com.imooc.o2o.entity.ShopCategory>
     */
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
