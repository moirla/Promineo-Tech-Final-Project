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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.promineo.donut.model.Donut;
import com.promineotech.donut.service.DonutService;

@RestController
@RequestMapping(value="/donut_sales/donut")
public class DonutController {
  
 private DonutService donutService;
  
  public DonutController(DonutService donutService) {
    super();
    this.donutService = donutService;
  }
  //build CREATE donut rest API
  @PostMapping
  public ResponseEntity<Donut> saveDonut(@RequestBody Donut donut){
  return new ResponseEntity<Donut>(donutService.saveDonut(donut), HttpStatus.CREATED);
  }

  //Build the Get all Donuts
  @GetMapping
  public List<Donut> getAllDonuts(){
    return donutService.getAlldonuts();
  }
  
  //DELETE a donut
  @DeleteMapping("{donut_id}")
  public ResponseEntity<String> deleteDonut(@PathVariable("donut_id") int donutId){
   donutService.deleteDonut(donutId);
    
    return new ResponseEntity<String>("Donut has been deleted", HttpStatus.OK);
  }
  
}
