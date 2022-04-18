/**
 * 
 */
package com.promineo.donut.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.promineo.donut.model.Customer;
import com.promineotech.donut.service.CustomerService;

@RestController
@RequestMapping(value="/donut_sales/customer")
public class CustomerController {
  
  private CustomerService customerService;
  
  public CustomerController(CustomerService customerService) {
    super();
    this.customerService = customerService;
  }
  
  
  //Build CREATE customer rest API
    //@RequestBody allows us to retrieve the requests body and convert it to a java object
  @PostMapping
  public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
  return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
  }
  
  
  //Build the GET all Customers
  @GetMapping
  public List<Customer> getAllCustomers(){
    return customerService.getAllCustomers();
  }
  
  //Build GET a customer by a single id
  @GetMapping("{customer_id}")
  public ResponseEntity<Customer> getCustomerById(@PathVariable("customer_id") int customerId){
    return new ResponseEntity<Customer>(customerService.getCustomerById(customerId), HttpStatus.OK);
  }
  
  
  //UPDATE a Customer 
  @PutMapping("{customer_id}")
  public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("customer_id") int customerId){
    return new ResponseEntity<Customer>(customerService.updateCustomer(customer, customerId), HttpStatus.OK);
  }
  
  //DELETE a customer
  @DeleteMapping("{customer_id}")
  public ResponseEntity<String> deleteCustomer(@PathVariable("customer_id") int customerId){
    customerService.deleteCustomer(customerId);
    
    return new ResponseEntity<String>("Customer has been deleted", HttpStatus.OK);
  }
  
}
