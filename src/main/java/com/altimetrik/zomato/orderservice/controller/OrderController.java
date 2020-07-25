package com.altimetrik.zomato.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.zomato.orderservice.model.OrderEntity;
import com.altimetrik.zomato.orderservice.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@RequestMapping(value = "/restaurants/{rid}/orders", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public OrderEntity createOder(@RequestBody OrderEntity order) {
		return orderService.createOrder(order);
	}
}
