package com.training.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.project.model.Property;

public interface PropertyRepository extends JpaRepository<Property,Integer>{

	@Query("select p from Property p where prop_type=?1")
	List<Property> findByType(String prop_type);
	
	@Query("select p from Property p where city=?1")
	List<Property> findByCity(String city);
	
	@Query("Select city from Property p where id=?1")
	String city(int id);
	
	@Query("Select price from Property where id=?1")
	String price(int id);
	
	@Query("Select prop_type from Property p where id=?1")
	String type(int id);
	
	@Query("Select prop_id from Property p where id=?1")
	String pid(int id);
}
