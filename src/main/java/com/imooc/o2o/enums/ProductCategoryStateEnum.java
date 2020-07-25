package com.imooc.o2o.enums;

/**
 * @project: o2o
 * @description: ProductCategoryState枚举类
 * @author: ysp
 * @create: 2020/07/22
 */
public enum ProductCategoryStateEnum {
	/**
	 * @author: ysp
	 * @description: 状态枚举
	 * @createTime: 2020/7/22 19:14
	 */
	SUCCESS(1, "创建成功"), INNER_ERROR(-1001, "操作失败"), EMPTY_LIST(-1002, "添加数少于1");

	private int state;

	private String stateInfo;

	private ProductCategoryStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static ProductCategoryStateEnum stateOf(int index) {
		for (ProductCategoryStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
