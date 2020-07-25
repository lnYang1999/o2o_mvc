package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ProductCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: ysp
 * @createTime: 2020/7/25 9:33
 */
public interface ProductCategoryDao {
    /**
     * @author: ysp
     * @description: 通过shop id 查询店铺商品类别
     * @createTime: 2020/7/25 11:17
     *
     * @param shopId
     * @return java.util.List<com.imooc.o2o.entity.ProductCategory>
     */
    List<ProductCategory> queryProductCategoryList(Long shopId);

    /**
     * @author: ysp
     * @description: 批量新增商品类别
     * @createTime: 2020/7/25 11:19
     *
     * @param productCategoryList
     * @return int
     */
    int batchInsertProductCategory(List<ProductCategory> productCategoryList);

    /**
     * @author: ysp
     * @description: 删除指定商品类别
     * @createTime: 2020/7/25 13:15
     *
     * @param productCategoryId
     * @param shopId
     * @return int
     */
    int deleteProductCategory(@Param("productCategoryId") long productCategoryId, @Param("shopId") long shopId);
}
