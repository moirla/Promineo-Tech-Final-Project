/**
 * 
 */
package com.promineo.donut.service.impl;

import org.springframework.stereotype.Service;
import com.promineo.donut.exception.ResourceNotFoundException;
import com.promineo.donut.model.Orders;
import com.promineo.donut.repository.OrderRepository;
import com.promineotech.donut.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;
  
  public OrderServiceImpl(OrderRepository orderRepository) {
    super();
    this.orderRepository = orderRepository;
  }
  

//CREATE
  public  Orders createOrder(Orders order) {
    order.setPrice(1.5);
    
    return orderRepository.save(order);
  }

  
  //DELETE
  @Override
  public void deleteOrder(int id) {
    Orders existingOrder = orderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("customer", "Id", id));
    orderRepository.deleteById(id);
  
}
}
