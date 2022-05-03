package com.training.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.project.model.Broker;
import com.training.project.repository.BrokerRepository;

@Component("brokerService")
public class BrokerServiceImp implements BrokerService {

	@Autowired
	BrokerRepository brokerRepository;
	
	public void add(Broker broker) {
		brokerRepository.save(broker);
	}
	

	public String brokerLogin(String br_username,String br_password) {
		
		if(!(brokerRepository.findByUserName(br_username).isPresent())) {
			return "unp";
		}
		
		return "True";
	}
}
