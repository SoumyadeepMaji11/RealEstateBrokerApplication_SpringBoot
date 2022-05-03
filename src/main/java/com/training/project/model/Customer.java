package com.training.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String cust_id;
	private String cust_name;
	private int cust_age;
	private String cust_gender;
	private String cust_password;
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(String cust_id, String cust_name, int cust_age, String cust_gender, String cust_password) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_age = cust_age;
		this.cust_gender = cust_gender;
		this.cust_password = cust_password;
	}



	public Customer(int id, String cust_id, String cust_name, int cust_age, String cust_gender, String cust_password) {
		super();
		this.id = id;
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_age = cust_age;
		this.cust_gender = cust_gender;
		this.cust_password = cust_password;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public int getCust_age() {
		return cust_age;
	}

	public void setCust_age(int cust_age) {
		this.cust_age = cust_age;
	}

	public String getCust_gender() {
		return cust_gender;
	}

	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}

	public String getCust_password() {
		return cust_password;
	}

	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}
	
	
}
