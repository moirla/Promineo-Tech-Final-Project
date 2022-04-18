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
import lombok.Data;

@Data
@Entity
@Table(name="donut")
public class Donut {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)   //MAKE SURE VARIABLE TYPES ARE CORRECT
  private int donut_id;  
   @Column
  private String decor_type;
   @Column
  private String donut_type;
   @Column
   private double price;
 

  
  
 
  //private int amount;
  
  
}

