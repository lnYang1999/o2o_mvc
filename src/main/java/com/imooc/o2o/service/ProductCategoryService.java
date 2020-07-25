package com.imooc.o2o.service;

import com.imooc.o2o.dto.ProductCategoryExecution;
import com.imooc.o2o.entity.ProductCategory;
import com.imooc.o2o.exceptions.ProductCategoryOperationException;

import java.util.List;

public interface ProductCategoryService {
    /**
     * @author: ysp
     * @description: 查询指定某个店铺下的所有商品类别信息
     * @createTime: 2020/7/25 10:27
     *
     * @param shopId
     * @return java.util.List<com.imooc.o2o.entity.ProductCategory>
     */
    List<ProductCategory> getProductCategoryList(Long shopId);

    /**
     * @author: ysp
     * @description: 批量插入
     * @createTime: 2020/7/25 11:33
     *
     * @param productCategoryList
     * @return com.imooc.o2o.dto.ProductCategoryExecution
     */
    ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
            throws ProductCategoryOperationException;

    /**
     * @author: ysp
     * @description: 将此类别下的商品里的类别id置为空，再删除掉该商品类别
     * @createTime: 2020/7/25 13:59
     *
     * @param productCategoryId
     * @param shopId
     * @return com.imooc.o2o.dto.ProductCategoryExecution
     */
    ProductCategoryExecution deleteProductCategory(long productCategoryId, long shopId)
            throws ProductCategoryOperationException;
}
