package com.nagarro.microservices.advanced.order.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.microservices.advanced.order.dtos.Order;

@RestController
public class OrderResource {

	@GetMapping("orders/1")
	public ResponseEntity<List<Order>> getMyOrders() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1, 250, "14-Apr-2020"));
		orders.add(new Order(2, 450, "15-Apr-2020"));
		return ResponseEntity.ok(orders);
	}

}
