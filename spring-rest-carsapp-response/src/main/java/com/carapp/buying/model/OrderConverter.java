package com.carapp.buying.model;

import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

	public OrderDTO toDto(Order order) {
		OrderDTO orderDto = new OrderDTO();
		orderDto.setBrand(order.getBrand());
		orderDto.setModel(order.getModel());
		orderDto.setColor(order.getColor());
		orderDto.setPrice(order.getPrice());
		orderDto.setBodyType(order.getBodyType());
		orderDto.setOrderId(order.getOrderId());
		return orderDto;
	}
}
