package com.carapp.buying.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.carapp.buying.model.Order;
@Repository
public class OrderRepositoryImpl implements IOrderRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addOrder(Order order) {
		String sql="insert into orders (orderId,carId,userId) values(?,?,?)";
		jdbcTemplate.update(sql,order.getOrderId(),order.getCarId(),order.getUserId());
		
	}

	@Override
	public void deleteOrder(int orderId) {
		String sql="delete from orders where orderId=?";
		jdbcTemplate.update(sql,orderId);
		
	}

	@Override
	public List<Order> findAll(String userId) {
		String sql="select * from car,orders where car.carId=orders.carId and orders.userId=?";
		return jdbcTemplate.query(sql, new OrderMapper(),userId);
	}

	
}
