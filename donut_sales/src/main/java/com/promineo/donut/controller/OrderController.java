
package com.promineo.donut.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.promineo.donut.model.Orders;
import com.promineotech.donut.service.OrderService;

@RestController
@RequestMapping(value="/donut_sales/orders")
public class OrderController {


private OrderService orderService;
  
  public OrderController(OrderService orderService) {
    super();
    this.orderService = orderService;
  }
  
  
  //Build CREATE customer rest API
    //@RequestBody allows us to retrieve the requests body and convert it to a java object
  @PostMapping
  public ResponseEntity<Orders> saveOrder(@RequestBody Orders order){
    
  return new ResponseEntity<Orders>(orderService.createOrder(order), HttpStatus.CREATED);
  }
  
//DELETE a customer
  @DeleteMapping("{order_id}")
  public ResponseEntity<String> deleteOrder(@PathVariable("order_id") int orderId){
   orderService.deleteOrder(orderId);
    
    return new ResponseEntity<String>("Order has been deleted", HttpStatus.OK);
    
  }
    
}