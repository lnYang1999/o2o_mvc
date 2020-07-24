package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

/**
 * @author: ysp
 * @createTime: 2020/7/23 11:23
 */
public interface ShopDao {
    /**
     * @author: ysp
     * @description: 新增店铺
     * @createTime: 2020/7/22 10:15
     *
     * @param [shop]
     * @return int
     */
    int insertShop(Shop shop);
    
    /**
     * @author: ysp
     * @description: 更新店铺信息
     * @createTime: 2020/7/22 11:24
     * 
     * @param [shop] 
     * @return int
     */
    int updateShop(Shop shop);
}
