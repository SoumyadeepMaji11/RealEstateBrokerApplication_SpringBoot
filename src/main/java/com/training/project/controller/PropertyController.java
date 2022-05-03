package com.training.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.project.model.Property;
import com.training.project.service.PropertyService;

@RestController
public class PropertyController {

	@Autowired
	PropertyService propertyService;
	
	//@Autowired
	//DealRepository dealRepository;
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		return new ModelAndView("home");
	}
	
	
	@RequestMapping("/addproperty")
	public ModelAndView addProperty() {
		return new ModelAndView("addproperty");
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView saveProperty(@RequestParam(name="prop_id") String prop_id,@RequestParam(name="prop_type") String prop_type,@RequestParam(name="offer_type") String offer_type, @RequestParam(name="city") String city, @RequestParam(name="price") String price) {
		System.out.println(prop_type);
		ModelAndView mv = new ModelAndView();
		Property property = new Property(prop_id,prop_type,offer_type,city,price);
		propertyService.saveProperty(property);
		mv.addObject("msg","Property Added");
		mv.setViewName("addproperty");
		return mv;
	}
	
	@RequestMapping("/viewproperty")
	public ModelAndView viewProperty() {
		ModelAndView mv = new ModelAndView();
		List<Property> list = propertyService.getAll();
		mv.addObject("list",list);
		mv.setViewName("viewproperty");
		return mv;
	}
	
	@RequestMapping("/viewpropertycustomer")
	public ModelAndView viewPropertyCustomer() {
		ModelAndView mv = new ModelAndView();
		List<Property> list = propertyService.getAll();
		mv.addObject("list",list);
		mv.setViewName("viewpropertycustomer");
		return mv;
	}
	
	@RequestMapping(value="/deleteproperty/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id) {
		propertyService.delete(id);
		return new ModelAndView("redirect:/viewproperty");
	}
	
	@RequestMapping(value="/editproperty/{id}",method = RequestMethod.GET)
	public ModelAndView editProperty(@PathVariable int id) {
		propertyService.getPropertyById(id);
		propertyService.delete(id);
		return new ModelAndView("editproperty");
	}
	
	@RequestMapping(value="editproperty/save", method = RequestMethod.POST)
	public ModelAndView editSaveProperty(@RequestParam(name="prop_id") String prop_id,@RequestParam(name="prop_type") String prop_type,@RequestParam(name="offer_type") String offer_type, @RequestParam(name="city") String city, @RequestParam(name="price") String price) {
		System.out.println(prop_type);
		ModelAndView mv = new ModelAndView();
		Property property = new Property(prop_id,prop_type,offer_type,city,price);
		propertyService.saveProperty(property);
		mv.setViewName("redirect:/viewproperty");
		return mv;
	}
	
	@RequestMapping(value="/searchbytype")
	public ModelAndView searchByType() {
		return new ModelAndView("searchbytype");
	}
	
	@RequestMapping(value="/propsearch",method = RequestMethod.POST)
	public ModelAndView searchPropType(@RequestParam(name="prop_type") String prop_type) {
		ModelAndView mv = new ModelAndView();
		List<Property> list = propertyService.getByType(prop_type);
		mv.addObject("list",list);
		mv.setViewName("viewpropertycustomer");
		return mv;
	}
	
	@RequestMapping(value="/searchbycity")
	public ModelAndView searchByCity() {
		return new ModelAndView("searchbycity");
	}
	
	@RequestMapping(value="/citysearch",method = RequestMethod.POST)
	public ModelAndView searchCity(@RequestParam(name="city") String city) {
		ModelAndView mv = new ModelAndView();
		List<Property> list = propertyService.getByCity(city);
		mv.addObject("list",list);
		mv.setViewName("viewpropertycustomer");
		return mv;
	}

}
