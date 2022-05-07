package com.training.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deal")
public class Deal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	//@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "cust_id")
	//private Customer customer;
	
	private String cust_id;
	private String prop_id;
	private String prop_type;
	private String city;
	private String price;
	

	
	public Deal() {
		super();
	}

	public Deal(int id, String cust_id, String prop_id, String prop_type, String city, String price) {
		this.id = id;
		this.cust_id = cust_id;
		this.prop_id = prop_id;
		this.prop_type = prop_type;
		this.city = city;
		this.price = price;
	}
	public Deal(String cust_id, String prop_id, String prop_type, String city, String price) {
		this.cust_id = cust_id;
		this.prop_id = prop_id;
		this.prop_type = prop_type;
		this.city = city;
		this.price = price;
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
	
	public String getProp_id() {
		return prop_id;
	}
	public void setProp_id(String prop_id) {
		this.prop_id = prop_id;
	}
	public String getProp_type() {
		return prop_type;
	}
	public void setProp_type(String prop_type) {
		this.prop_type = prop_type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
