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

import com.carapp.buying.model.Order;
import com.carapp.buying.model.OrderDTO;
import com.carapp.buying.service.IOrderService;

@RestController
@RequestMapping("/order-api")
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	@PostMapping("/orders")
	ResponseEntity<Void> addOrder(@RequestBody Order order){
		orderService.addOrder(order);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "ordering the car");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}
	@DeleteMapping("/orders/orderId/{orderId}")
	ResponseEntity<Void> deleteOrder(@PathVariable("orderId") int orderId){
		orderService.deleteOrder(orderId);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "cancelling the ordered car");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	}
	@GetMapping("/orders/userId/{userId}")
	ResponseEntity<List<OrderDTO>> getAll(@PathVariable("userId") String userId){
		List<OrderDTO> orderDto=orderService.getAll(userId);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "order details by userid");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).body(orderDto);
	}
	
}
