/**
 * 
 */
package com.promineo.donut.repository;

//second created this interface and extended JpaRepository
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.promineo.donut.model.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer>{  
  /*
   * Dummy class that holds all of the items that are in the JpaReposity so
   * i can extend them later on
   */
}
