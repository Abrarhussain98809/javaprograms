package com.carapp.buying.service;

import java.util.List;

import com.carapp.buying.model.Order;
import com.carapp.buying.model.OrderDTO;

public interface IOrderService {

	void addOrder(Order order);
	void deleteOrder(int orderId);
	List<OrderDTO> getAll(String userId);
	
}
