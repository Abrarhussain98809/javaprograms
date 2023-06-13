package com.carapp.buying.repository;

import java.util.List;

import com.carapp.buying.model.Cart;


public interface ICartRepository {

	void addToCart(Cart cart);
	List<Cart> findAll(String userId);
	void removeFromCart(int cartId);
}
