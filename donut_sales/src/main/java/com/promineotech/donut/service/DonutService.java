/**
 * 
 */
package com.promineotech.donut.service;

import java.util.List;
import com.promineo.donut.model.Donut;

public interface DonutService {

  //Create
  
  Donut saveDonut(Donut donut);

  List<Donut> getAlldonuts();
  
//delete

 void deleteDonut(int id);
  
}
