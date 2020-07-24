package com.imooc.o2o.exceptions;

/**
 * @project: o2o
 * @description: Shop操作异常类
 * @author: ysp
 * @create: 2020/07/22
 */
public class ShopOperationException extends RuntimeException{
    private static final long serialVersionUID = 2361446884822298905L;

    public ShopOperationException(String msg){
        super(msg);
    }
}
