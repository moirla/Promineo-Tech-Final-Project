/**
 * 
 */
package com.promineo.donut.exception;



//Third I made this exception, most common to find this 404

//This is the easiest way to make our error exception


public class ResourceNotFoundException extends RuntimeException{


  private String resourceName;

 
  public String getResourceName() {
    return resourceName;
  }
  
  public String getFieldName() {
    return fieldName;
  }
  
  public Object getFieldValue() {
    return fieldValue;
  }


  private String fieldName;

  private Object fieldValue;

 
  public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
                   //"resourceName not found with fieldName : fieldValue"
    super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
    this.resourceName = resourceName;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
  }
  
  
  
}
