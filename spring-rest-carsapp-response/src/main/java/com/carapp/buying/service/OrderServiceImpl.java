package com.carapp.buying.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapp.buying.model.Order;
import com.carapp.buying.model.OrderConverter;
import com.carapp.buying.model.OrderDTO;
import com.carapp.buying.repository.IOrderRepository;
@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	IOrderRepository orderRepository;
	@Autowired
	OrderConverter orderConverter;
	@Override
	public void addOrder(Order order) {
		orderRepository.addOrder(order);
		
	}

	@Override
	public void deleteOrder(int orderId) {
		orderRepository.deleteOrder(orderId);
		
	}

	@Override
	public List<OrderDTO> getAll(String userId) {
		List<Order> orders=orderRepository.findAll(userId);
		return orders.stream().map(order->orderConverter.toDto(order))
				.collect(Collectors.toList());
	}

}
