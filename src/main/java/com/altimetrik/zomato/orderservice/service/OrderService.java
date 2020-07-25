package com.altimetrik.zomato.orderservice.service;


import com.altimetrik.zomato.orderservice.model.OrderEntity;

public interface OrderService {
    OrderEntity createOrder(OrderEntity order);
}
