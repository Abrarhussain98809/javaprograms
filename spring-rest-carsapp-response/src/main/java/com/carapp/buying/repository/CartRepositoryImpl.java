package com.carapp.buying.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.carapp.buying.model.Cart;


@Repository
public class CartRepositoryImpl implements ICartRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addToCart(Cart cart) {
		String sql="insert into cart(cartId,carId,userId) values(?,?,?)";
		jdbcTemplate.update(sql,cart.getCartId(), cart.getCarId(),cart.getUserId());
	}

	@Override
	public List<Cart> findAll(String userId) {
		String sql="select * from car,cart where car.carId=cart.carId and cart.userId=?";
		return jdbcTemplate.query(sql, new CartMapper(),userId);
	}

	@Override
	public void removeFromCart(int cartId) {
		String sql="delete from cart where cartId=?";
		jdbcTemplate.update(sql,cartId);
		
	}
	
}
