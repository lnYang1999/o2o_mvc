package com.imooc.o2o.service;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exceptions.ShopOperationException;

import java.io.File;
import java.io.InputStream;

public interface ShopService {
    /**
     * @author: ysp
     * @description: 根据shopCondition分页返回相应店铺列表数据
     * @createTime: 2020/7/24 19:46
     *
     * @param shopCondition
     * @param pageIndex
     * @param pageSize
     * @return com.imooc.o2o.dto.ShopExecution
     */
    public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);

    /**
     * @author: ysp
     * @description: 通过店铺Id获取店铺信息
     * @createTime: 2020/7/24 10:37
     *
     * @param shopId
     * @return com.imooc.o2o.entity.Shop
     */
    Shop getByShopId(long shopId);

    /**
     * @author: ysp
     * @description: 更新店铺信息，包括对图片的处理
     * @createTime: 2020/7/24 10:39
     *
     * @param shop
     * @param shopImgInputStream
     * @param fileName
     * @return com.imooc.o2o.dto.ShopExecution
     */
    ShopExecution modifyShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

    /**
     * @author: ysp
     * @description: 注册店铺信息，包括图片处理
     * @createTime: 2020/7/24 10:36
     *
     * @param shop
     * @param thumbnail
     * @return com.imooc.o2o.dto.ShopExecution
     */
    ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
}
