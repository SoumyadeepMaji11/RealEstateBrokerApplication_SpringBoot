package com.training.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.project.model.Customer;
import com.training.project.repository.CustomerRepository;

@Component("customerService")
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public List<Customer> getAll(){
		return (List<Customer>)customerRepository.findAll();	
	}
	
	public String customerLogin(String cust_name,String cust_password) {
		if(!(customerRepository.findByUserName(cust_name).isPresent())) {
			return "unp";
		}
		
		if(!(customerRepository.findByUserName(cust_name).get().getCust_password().equals(cust_password))) {
			return "pnp";
		}
		
		return "True";
	}

}