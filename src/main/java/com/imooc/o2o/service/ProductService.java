package com.imooc.o2o.service;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ProductExecution;
import com.imooc.o2o.entity.Product;
import com.imooc.o2o.exceptions.ProductOperationException;

import java.util.List;

public interface ProductService {

    /**
     * @author: ysp
     * @description: 查询商品列表并分页，可输入的条件有： 商品名（模糊），商品状态，店铺Id,商品类别
     * @createTime: 2020/7/26 11:57
     *
     * @param productCondition
     * @param pageIndex
     * @param pageSize
     * @return com.imooc.o2o.dto.ProductExecution
     */
    ProductExecution getProductList(Product productCondition, int pageIndex, int pageSize);

    /**
     * @author: ysp
     * @description: 通过商品Id查询唯一的商品信息
     * @createTime: 2020/7/26 11:56
     *
     * @param productId
     * @return com.imooc.o2o.entity.Product
     */
    Product getProductById(long productId);

    /**
     * @author: ysp
     * @description: 添加商品信息以及图片处理
     * @createTime: 2020/7/25 19:57
     *
     * @param product
     * @param thumbnail
     * @param productImgHolderList
     * @return com.imooc.o2o.dto.ProductExecution
     */
    ProductExecution addProduct(Product product, ImageHolder thumbnail, List<ImageHolder> productImgHolderList)
            throws ProductOperationException;

    /**
     * @author: ysp
     * @description: 修改商品信息以及图片处理
     * @createTime: 2020/7/26 11:57
     *
     * @param product
     * @param thumbnail
     * @param productImgHolderList
     * @return com.imooc.o2o.dto.ProductExecution
     */
    ProductExecution modifyProduct(Product product, ImageHolder thumbnail, List<ImageHolder> productImgHolderList)
            throws ProductOperationException;
}
