package com.carapp.buying.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.carapp.buying.model.Cart;
import com.carapp.buying.model.CartDTO;

public class CartMapper implements RowMapper<Cart>{

	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cart cart=new Cart();
		cart.setBrand(rs.getString("brand"));
		cart.setColor(rs.getString("color"));
		cart.setCartId(rs.getInt("cartId"));
		cart.setModel(rs.getString("model"));
		cart.setPrice(rs.getDouble("price"));
		cart.setBodyType(rs.getString("bodyType"));
		cart.setFuelType(rs.getString("fuelType"));
		cart.setYear(rs.getDouble("year"));
		return cart;
	}

}
