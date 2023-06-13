package com.carapp.buying.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapp.buying.model.Cart;
import com.carapp.buying.model.CartConverter;
import com.carapp.buying.model.CartDTO;
import com.carapp.buying.repository.ICartRepository;
@Service
public class CartServiceImpl implements ICartService {
	
	@Autowired
	ICartRepository cartRepository;
	@Autowired
	CartConverter cartConverter;
	
	@Override
	public void addToCart(Cart cart) {
		cartRepository.addToCart(cart);
		
	}

	@Override
	public List<CartDTO> getAll(String userId) {
		List<Cart> carts=cartRepository.findAll(userId);
		return carts.stream().map(cart->cartConverter.toDto(cart))
				.collect(Collectors.toList());
	}

	@Override
	public void removeFromCart(int cartId) {
		cartRepository.removeFromCart(cartId);
		
	}

	
}
