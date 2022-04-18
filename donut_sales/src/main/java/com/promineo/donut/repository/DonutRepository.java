/**
 * 
 */
package com.promineo.donut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.promineo.donut.model.Donut;

@Repository
public interface DonutRepository extends JpaRepository<Donut, Integer>{

}
