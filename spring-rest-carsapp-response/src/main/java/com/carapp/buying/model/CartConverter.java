package com.carapp.buying.model;

import org.springframework.stereotype.Component;

@Component
public class CartConverter {

	public CartDTO toDto(Cart cart) {
		CartDTO cartDto=new CartDTO();
		cartDto.setBrand(cart.getBrand());
		cartDto.setCartId(cart.getCartId());
		cartDto.setColor(cart.getColor());
		cartDto.setModel(cart.getModel());
		cartDto.setPrice(cart.getPrice());
		cartDto.setBodyType(cart.getBodyType());
		return cartDto;
	}
}
