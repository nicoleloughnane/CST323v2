package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.CST323SpringV2;
import com.gcu.model.OrderModel;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class OrdersBusinessService implements OrdersBusinessInterface{

	
	public void test() {
		System.out.println("Hello from the OrdersBusinessService");
		
	}

	
	public List<OrderModel> getOrders() {
		//create orders
		log.info("in getOrders in OrdersBusinessService");
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "0000000001", "Product 1", 1.00f, 1));
		orders.add(new OrderModel(1L, "0000000002", "Product 2", 2.00f, 2));
		orders.add(new OrderModel(2L, "0000000003", "Product 3", 3.00f, 3));
		orders.add(new OrderModel(3L, "0000000004", "Product 4", 4.00f, 4));
		orders.add(new OrderModel(4L, "0000000005", "Product 5", 5.00f, 5));
		return orders;
	}


	@Override
	public void init() {
		System.out.println("In the OrdersBusinessService.init()");
		
	}


	@Override
	public void destroy() {
		System.out.println("In the OrdersBusinessService.destroy()");
		
	}
	
	

}
