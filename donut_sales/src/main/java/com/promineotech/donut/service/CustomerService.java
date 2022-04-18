package com.promineotech.donut.service;

import java.util.List;
import com.promineo.donut.model.Customer;

// The SERVICE feeds the Service Implementation, the Service Implementation feeds the Controller.
// Drag the tabs into that order, and start with the player service


public interface CustomerService {

  // create
  Customer saveCustomer(Customer customer);

  // read
  List<Customer> getAllCustomers();

  Customer getCustomerById(int id);

  // update a customer

  Customer updateCustomer(Customer customer, int Id);

  // delete

  void deleteCustomer(int id);

}
