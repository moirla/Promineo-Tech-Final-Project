/**
 * 
 */
package com.promineo.donut.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
@Entity
@Table(name="orders")
public class Orders {
  
  

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)   //MAKE SURE VARIABLE TYPES ARE CORRECT
  private int order_id;
  @Column
  private String customer;
  
  @Column
  private int donutid;
  
  private String donut;
  
  @Column
  private double price;
 
  
}
