/**
 * 
 */
package com.promineo.donut.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineo.donut.exception.ResourceNotFoundException;
import com.promineo.donut.model.Customer;
import com.promineo.donut.model.Donut;
import com.promineo.donut.repository.DonutRepository;
import com.promineotech.donut.service.DonutService;

@Service
public class DonutServiceImpl implements DonutService{
  
  private DonutRepository donutRepository;


  public DonutServiceImpl(DonutRepository donutRepository) {
    super();
    this.donutRepository = donutRepository;
  }

  //CREATE
  @Override
  public Donut saveDonut(Donut donut) {
    donut.setPrice(1.5);
    return donutRepository.save(donut);
  }

//READ
  @Override
  public List<Donut> getAlldonuts() {
    return donutRepository.findAll();    
}
  
//DELETE
  @Override
  public void deleteDonut(int id) {
    Donut existingDonut = donutRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("donut", "Id", id));
    donutRepository.deleteById(id);  
}
  
}
