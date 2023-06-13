package com.carapp.buying.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carapp.buying.model.Cart;
import com.carapp.buying.model.CartDTO;
import com.carapp.buying.service.ICartService;

@RestController
@RequestMapping("/cart-api")
public class CartController {
	
	@Autowired
	ICartService cartService;
	
	@PostMapping("/cart")
	ResponseEntity<Void> addToCart(@RequestBody Cart cart){
		cartService.addToCart(cart);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "adding car to cart");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}
	@GetMapping("/cart/userId/{userId}")
	ResponseEntity<List<CartDTO>> getAll(@PathVariable("userId") String userId){
		List<CartDTO> cars=cartService.getAll(userId);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Returning cars from cart");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cars);
	}
	@DeleteMapping("cart/cartId/{cartId}")
	ResponseEntity<Void> removeFromCart(@PathVariable("cartId") int cartId){
		cartService.removeFromCart(cartId);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "removing cars from cart");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	}
	
	
}
