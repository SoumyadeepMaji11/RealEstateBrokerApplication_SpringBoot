package com.training.project.service;

import com.training.project.model.Broker;

public interface BrokerService {

	public void add(Broker broker);
	
	public String brokerLogin(String br_username,String br_password);
}
