/**
 * 
 */
package com.promineo.donut.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineo.donut.model.Customer;
import com.promineo.donut.repository.CustomerRepository;
import com.promineotech.donut.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

  //this is the dummy repository that will store our CRUD methods
  private CustomerRepository customerRepository;

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    super();
    this.customerRepository = customerRepository;
  }

  //CREATE
  @Override
  public Customer saveCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

}
