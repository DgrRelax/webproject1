package com.dgr.model;

public class OrderDetail {
	// 主键 订单明细表
	private Integer id;
	// 订单id
	private Integer ordersId;
	// 商品id
	private Integer itemsId;
	// 商品的购买数量
	private Integer itemsNum;
	// 对应的商品信息
	private Items items;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public Integer getItemsId() {
		return itemsId;
	}

	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}

	public Integer getItemsNum() {
		return itemsNum;
	}

	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemsNum=" + itemsNum
				+ ", items=" + items + "]";
	}

}
