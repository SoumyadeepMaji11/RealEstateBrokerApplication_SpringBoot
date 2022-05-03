package com.training.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.project.model.Property;
import com.training.project.repository.PropertyRepository;

@Component("propertyService")
public class PropertyServiceImp implements PropertyService{
	
	@Autowired
	PropertyRepository propertyRepository;

	public void saveProperty(Property property) {
		propertyRepository.save(property);
	}
	
	public List<Property> getAll(){
		return (List<Property>)propertyRepository.findAll();	
		}
	
	public void delete(int id) {
		propertyRepository.deleteById(id);
	}
	
	public Property getPropertyById(int id) {
		return propertyRepository.findById(id).get();
	}
	
	public List<Property> getByType(String prop_type){
		return (List<Property>)propertyRepository.findByType(prop_type);
	}
	
	public List<Property> getByCity(String city){
		return (List<Property>)propertyRepository.findByCity(city);
	}
	
	public String getCity(int id) {
		return propertyRepository.city(id);
	}
	
	public String getPrice(int id) {
		return propertyRepository.price(id);
	}
	
	public String getType(int id) {
		return propertyRepository.type(id);
	}
	
	public String getPid(int id) {
		return propertyRepository.pid(id);
	}
} 
