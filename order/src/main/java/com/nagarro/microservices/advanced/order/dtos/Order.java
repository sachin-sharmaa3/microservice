package com.nagarro.microservices.advanced.order.dtos;

public class Order {

	private int orderId;
	private int orderAmount;
	private String orderDate;

	public Order() {
		super();
	}

	public Order(int orderId, int orderAmount, String orderDate) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

}
