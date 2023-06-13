package com.carapp.buying.service;

import java.util.List;

import com.carapp.buying.model.Cart;
import com.carapp.buying.model.CartDTO;

public interface ICartService {

	void addToCart(Cart cart);
	List<CartDTO> getAll(String userId);
	void removeFromCart(int cartId);
}
