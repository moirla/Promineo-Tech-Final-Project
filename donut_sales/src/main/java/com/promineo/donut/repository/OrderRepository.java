/**
 * 
 */
package com.promineo.donut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.promineo.donut.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
