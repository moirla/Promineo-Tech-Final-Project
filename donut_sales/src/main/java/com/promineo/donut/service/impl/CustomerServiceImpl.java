/**
 * 
 */
package com.promineo.donut.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineo.donut.exception.ResourceNotFoundException;
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
  
 //READ
  @Override
  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }
  //handles customers by id
  @Override
  public Customer getCustomerById(int id) {
    //using a lambda
    return customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("customer", "Id", id)
        );
  }
  
  //UPDATE
  @Override
  public Customer updateCustomer(Customer customer, int id) {
    Customer existingCustomer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("customer", "Id", id));
    existingCustomer.setFirst_name(customer.getFirst_name());
    existingCustomer.setLast_name(customer.getLast_name());
    existingCustomer.setPhone(customer.getPhone());
    
    customerRepository.save(existingCustomer);
    
        return existingCustomer;
  }

  //DELETE
  @Override
  public void deleteCustomer(int id) {
    Customer existingCustomer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("customer", "Id", id));
    customerRepository.deleteById(id);
  }

}
