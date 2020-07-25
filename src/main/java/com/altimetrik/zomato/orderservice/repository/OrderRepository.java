package com.altimetrik.zomato.orderservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altimetrik.zomato.orderservice.model.OrderEntity;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<OrderEntity, String> {
	public OrderEntity findFirstByOrderId(@Param("id") String id);

	//public void delete(@Param("id") String id);

	public OrderEntity save(@Param("order") OrderEntity order);
}
