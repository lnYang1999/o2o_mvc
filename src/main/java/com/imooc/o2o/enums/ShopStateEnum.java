package com.imooc.o2o.enums;

/**
 * @project: o2o
 * @description: ShopState枚举类
 * @author: ysp
 * @create: 2020/07/22
 */
public enum  ShopStateEnum {
    /**
     * @author: ysp
     * @description: 状态枚举
     * @createTime: 2020/7/22 19:14
     */
    CHECK(0,"审核中"),
    OFFLINE(-1,"非法店铺"),
    SUCCESS(1,"操作成功"),
    PASS(2,"通过认证"),
    INNER_ERROR(-1001,"内部系统错误"),
    NULL_SHOPID(-1002,"ShopId为空"),
    NULL_SHOP(-1003,"Shop信息为空");

    private int state;
    private String stateInfo;

    private ShopStateEnum(int state,String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * @author: ysp
     * @description: 依据传入的state返回相应的enum值
     * @createTime: 2020/7/22 19:17
     *
     * @return com.imooc.o2o.enums.ShopStateEnum
     */
    public static ShopStateEnum stateOf(int state){
        for (ShopStateEnum stateEnum : values()){
            if (stateEnum.getState() == state){
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
