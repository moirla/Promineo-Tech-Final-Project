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

//began here

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {

  /*
   * GeneratedValue goes with @Id
   */
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)   //MAKE SURE VARIABLE TYPES ARE CORRECT
  private int customer_id;
  @Column
  private String first_name;
  @Column
  private String last_name;
  @Column
  private String phone;
  
}
