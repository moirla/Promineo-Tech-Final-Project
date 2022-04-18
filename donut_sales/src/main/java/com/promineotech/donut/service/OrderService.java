/**
 * 
 */
package com.promineotech.donut.service;

import com.promineo.donut.model.Donut;
import com.promineo.donut.model.Orders;

public interface OrderService {
  
  //Create
  Orders createOrder(Orders order);
  
  //Delete
  void deleteOrder(int id);
  


}
