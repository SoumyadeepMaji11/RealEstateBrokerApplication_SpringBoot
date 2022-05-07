package com.training.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.project.model.Customer;
import com.training.project.model.Deal;
import com.training.project.repository.CustomerRepository;
import com.training.project.service.CustomerService;
import com.training.project.service.DealService;
import com.training.project.service.PropertyService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	PropertyService propertyService;
	
	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	DealService dealService;
	
	public String idx;
	
	//Hell0
	
	@RequestMapping("/registration")
	public ModelAndView registrationForm() {
		return new ModelAndView("addcustomer");
	}
	
	@RequestMapping("/customerhome")
	public ModelAndView customerHome() {
		return new ModelAndView("customerhome");
	}

	@RequestMapping(value="/saves", method = RequestMethod.POST) 
	public ModelAndView saveCustomer(@RequestParam(name="cust_id") String cust_id,@RequestParam(name="cust_name") String cust_name, @RequestParam(name="cust_age") int cust_age,@RequestParam(name="cust_gender") String cust_gender,@RequestParam(name="cust_password") String cust_password) {
		System.out.println(cust_name);
		ModelAndView m = new ModelAndView();
		Customer customer = new Customer(cust_id,cust_name,cust_age,cust_gender,cust_password);
		customerService.saveCustomer(customer);
		m.addObject("msg", "Welcome " + cust_name + " ,You have successfully Registered. Now Login to your account");
		m.setViewName("addcustomer");
		return m;	
	}

	@RequestMapping("/login")
	public ModelAndView loginForm() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/loginto",method=RequestMethod.POST)
	public ModelAndView customerLogin(@RequestParam(name="cust_name") String cust_name,@RequestParam(name="cust_password") String cust_password) {
		ModelAndView mv = new ModelAndView();
		String s = customerService.customerLogin(cust_name,cust_password);
		if(s.equals("unp")) {
			mv.setViewName("login"); 
			mv.addObject("msg","User Name Not Present");
			return mv;
		}
		else if(s.equals("pnp")) {
			mv.setViewName("login");
			mv.addObject("msg","Password is Incorrect");
		}
		else {
		mv.setViewName("customerhome");
		idx = customerRepository.findByUserName(cust_name).get().getCust_id();
		return mv;
		}
		
		return mv;
	}
	
	@RequestMapping("/viewcustomers")
	public ModelAndView viewCustomer() {
		ModelAndView mv = new ModelAndView();
		List<Customer> list = customerService.getAll();
		mv.addObject("list",list);
		mv.setViewName("viewcustomer");
		return mv;
	}
	
	
	@RequestMapping(value="/registerproperty/{id}")
	public ModelAndView registerProperty(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		
		String pid = propertyService.getPid(id);
		String c = propertyService.getCity(id);
		String p = propertyService.getPrice(id);
		String t = propertyService.getType(id);
		
		Deal deal = new Deal(idx,pid,t,c,p);
		dealService.saveDeal(deal);
		mv.setViewName("customerhome");
		mv.addObject("msg","Property Registration Complete");
		return mv;
	}

	
}
