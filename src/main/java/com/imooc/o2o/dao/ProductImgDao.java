package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ProductImg;

import java.util.List;

/**
 * @author: ysp
 * @createTime: 2020/7/25 9:39
 */
public interface ProductImgDao {
    /**
     * @author: ysp
     * @description: 列出某个商品的详情图列表
     * @createTime: 2020/7/26 12:04
     *
     * @param productId
     * @return java.util.List<com.imooc.o2o.entity.ProductImg>
     */
    List<ProductImg> queryProductImgList(long productId);

    /**
     * 批量添加商品详情图片
     *
     * @param productImgList
     * @return
     */
    int batchInsertProductImg(List<ProductImg> productImgList);

    /**
     * 删除指定商品下的所有详情图
     *
     * @param productId
     * @return
     */
    int deleteProductImgByProductId(long productId);
}
