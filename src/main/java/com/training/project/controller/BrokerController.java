package com.training.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.project.model.Broker;
import com.training.project.model.Deal;
import com.training.project.repository.DealRepository;
import com.training.project.service.BrokerService;

@RestController
public class BrokerController {

	@Autowired
	BrokerService brokerService;
	
	@Autowired
	DealRepository dealRepository;
	
	//Input broker using Postman
	@RequestMapping(value="/addbroker",method=RequestMethod.POST)
	public void addBroker(@RequestBody Broker broker) {
		brokerService.add(broker);
	}
	
	@RequestMapping("/brokerlogin")
	public ModelAndView brokerLoginPage() {
		return new ModelAndView("brokerlogin");
	}
	
	@RequestMapping("/brokerhome")
	public ModelAndView brokerHome() {
		return new ModelAndView("brokerhome");
	}
	
	@RequestMapping(value="/logintobr",method=RequestMethod.POST)
	public ModelAndView brLogin(@RequestParam(name="br_username") String br_username,@RequestParam(name="br_password") String br_password) {
		ModelAndView mv = new ModelAndView();
		String s = brokerService.brokerLogin(br_username,br_password);
		if(s.equals("unp")) {
			mv.setViewName("brokerlogin");
			mv.addObject("msg","User Name Not Present");
			return mv;
		}
		
		mv.setViewName("brokerhome");
		return mv;
	}
	
	@RequestMapping("/viewdeals")
	public ModelAndView viewDeals() {
		ModelAndView mv = new ModelAndView();
		List<Deal> list = dealRepository.findAll();
		mv.addObject("list",list);
		mv.setViewName("customerdeals");
		return mv;
	}
	
	@RequestMapping("deletedeal/{id}")
	public ModelAndView delete(@PathVariable int id) {
		dealRepository.deleteById(id);
		return new ModelAndView("redirect:/viewdeals");
	}
	
}

