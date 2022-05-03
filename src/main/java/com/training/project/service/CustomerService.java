package com.training.project.service;

import java.util.List;

import com.training.project.model.Customer;

public interface CustomerService {
	
	public void saveCustomer(Customer customer);
	
	public List<Customer> getAll();

	public String customerLogin(String cust_name, String cust_password);
	
}