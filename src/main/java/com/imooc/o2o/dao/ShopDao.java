package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: ysp
 * @createTime: 2020/7/23 11:23
 */
public interface ShopDao {
    /**
     * @author: ysp
     * @description: 分页查询店铺，可输入的条件有：店铺名（模糊），店铺状态，店铺类别，区域Id，owner
     * @createTime: 2020/7/24 17:40
     *
     * @param shopCondition
     * @param rowIndex 从第几行开始取数据的
     * @param pageSize 要返回多少行数据
     * @return java.util.List<com.imooc.o2o.entity.Shop>
     */
    List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition,
                             @Param("rowIndex") int rowIndex,
                             @Param("pageSize") int pageSize);

    /**
     * @author: ysp
     * @description: 返回queryShopList总数
     * @createTime: 2020/7/24 18:03
     *
     * @param shopCondition
     * @return int
     */
    int queryShopCount(@Param("shopCondition") Shop shopCondition);

    /**
     * @author: ysp
     * @description: 通过shop Id查询店铺
     * @createTime: 2020/7/24 10:16
     *
     * @param shopId
     * @return com.imooc.o2o.entity.Shop
     */
    Shop queryByShopId(long shopId);

    /**
     * @author: ysp
     * @description: 新增店铺
     * @createTime: 2020/7/24 10:13
     *
     * @param shop
     * @return int
     */
    int insertShop(Shop shop);

    /**
     * @author: ysp
     * @description: 更新店铺信息
     * @createTime: 2020/7/24 10:12
     *
     * @param shop
     * @return int
     */
    int updateShop(Shop shop);
}
