package com.carapp.buying.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.carapp.buying.model.Order;

public class OrderMapper implements RowMapper<Order>{

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order=new Order();
		order.setBrand(rs.getString("brand"));
		order.setColor(rs.getString("color"));
		order.setOrderId(rs.getInt("orderId"));
		order.setModel(rs.getString("model"));
		order.setPrice(rs.getDouble("price"));
		order.setBodyType(rs.getString("bodyType"));
		order.setFuelType(rs.getString("fuelType"));
		order.setYear(rs.getDouble("year"));
		return order;
	}

	
}
