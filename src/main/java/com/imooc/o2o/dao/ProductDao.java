package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: ysp
 * @createTime: 2020/7/25 9:31
 */
public interface ProductDao {
    /**
     * @author: ysp
     * @description: 查询商品列表并分页，可输入的条件有： 商品名（模糊），商品状态，店铺Id,商品类别
     * @createTime: 2020/7/26 16:35
     *
     * @param productCondition
     * @param rowIndex
     * @param pageSize
     * @return List<Product>
     */
    List<Product> queryProductList(@Param("productCondition") Product productCondition, @Param("rowIndex") int rowIndex,
                                   @Param("pageSize") int pageSize);

    /**
     * @author: ysp
     * @description: 查询对应的商品总数
     * @createTime: 2020/7/26 16:37
     *
     * @param productCondition
     * @return int
     */
    int queryProductCount(@Param("productCondition") Product productCondition);

    /**
     * 通过productId查询唯一的商品信息
     *
     * @param productId
     * @return
     */
    Product queryProductById(long productId);

    /**
     * 插入商品
     *
     * @param product
     * @return
     */
    int insertProduct(Product product);

    /**
     * 更新商品信息
     *
     * @param product
     * @return
     */
    int updateProduct(Product product);

    /**
     * 删除商品类别之前，将商品类别ID置为空
     *
     * @param productCategoryId
     * @return
     */
    int updateProductCategoryToNull(long productCategoryId);
//
//    /**
//     * 删除商品
//     *
//     * @param productId
//     * @return
//     */
//    int deleteProduct(@Param("productId") long productId, @Param("shopId") long shopId);
}
