package com.carapp.buying.repository;

import java.util.List;

import com.carapp.buying.model.Order;

public interface IOrderRepository {

	void addOrder(Order order);
	void deleteOrder(int orderId);
	List<Order> findAll(String userId);
}
