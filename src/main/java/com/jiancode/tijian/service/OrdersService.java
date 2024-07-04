package com.jiancode.tijian.service;

import com.jiancode.tijian.po.Orders;

import java.util.List;

public interface OrdersService {

	
	public int getOrdersByUserId(String userId);
	public int saveOrders(Orders orders);
	public List<Orders> listOrdersByUserId(Orders orders);
	public int removeOrders(Integer orderId);
	public Orders getOrdersById(Integer orderId);
}
