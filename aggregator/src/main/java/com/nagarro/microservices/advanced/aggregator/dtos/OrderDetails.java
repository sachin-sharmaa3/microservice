package com.nagarro.microservices.advanced.aggregator.dtos;

import java.util.List;

public class OrderDetails {

	private User userDetails;

	private List<Order> orders;

	public OrderDetails() {
		super();
	}

	public OrderDetails(List<Order> orders, User userDetails) {
		super();
		this.orders = orders;
		this.userDetails = userDetails;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
