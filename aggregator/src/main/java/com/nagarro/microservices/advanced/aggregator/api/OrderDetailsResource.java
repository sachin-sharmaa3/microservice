package com.nagarro.microservices.advanced.aggregator.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.microservices.advanced.aggregator.dtos.Order;
import com.nagarro.microservices.advanced.aggregator.dtos.OrderDetails;
import com.nagarro.microservices.advanced.aggregator.dtos.User;

@RestController
public class OrderDetailsResource {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${USER_URL:http://localhost:8081}")
	private String userUrl;

	@Value("${ORDER_URL:http://localhost:8080}")
	private String orderUrl;

	@GetMapping("orderdetails/1")
	public ResponseEntity<OrderDetails> getMyOrderDetails() {
		User user = this.restTemplate.getForEntity(userUrl + "/user/1", User.class).getBody();
		Order[] orders = this.restTemplate.getForEntity(orderUrl + "/orders/1", Order[].class).getBody();
		return ResponseEntity.ok(new OrderDetails(Arrays.asList(orders), user));
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
