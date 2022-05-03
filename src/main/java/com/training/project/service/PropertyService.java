package com.training.project.service;

import java.util.List;

import com.training.project.model.Property;

public interface PropertyService {

	public void saveProperty(Property property);
	
	public List<Property> getAll();
	
	public void delete(int id);
	
	public Property getPropertyById(int id);
	
	public List<Property> getByType(String prop_type);
	
	public List<Property> getByCity(String city);
	
	public String getCity(int id);
	
	public String getPrice(int id);
	
	public String getType(int id);
	
	public String getPid(int id);
}
