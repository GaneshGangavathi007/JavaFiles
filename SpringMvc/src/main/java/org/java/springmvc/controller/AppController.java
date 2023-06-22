package org.java.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.springmvc.dto.Person;
import org.java.springmvc.dto.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@CrossOrigin("*")
@RestController
public class AppController {
	
	@GetMapping("/message")
	public void message() {
		System.out.println("message() executed");
	}
	@GetMapping("/message2")
	public void message2() {
		System.out.println("message2() executed");
	}
	
	@GetMapping("/data/{id}/{name}")
	public String getUrlData(@PathVariable("id") int id,@PathVariable("name") String name) {
		return id+" is the received id and name is "+name;
	}
	
	@GetMapping("/paraData")
	public String getParameter(@RequestParam("id") int id,@RequestParam("name") String name) {
		
		return name+" "+id;
	}
	@PostMapping("/getPerson")
	public String getPerson(@RequestBody Person person) {
		return person+" Data Accepted";
	}
	@PostMapping("/getOrder")
	public @ResponseBody String getOrder(@RequestBody Order order) {
		return order+" Data Accepted";
	}
	
	@PostMapping("/allOrders")
	public List<Order> getAllOrders(){
		List<Order> list = new ArrayList<>();
		list.add(new Order(1,"Biryani"));
		list.add(new Order(2,"Chicken curry"));
		list.add(new Order(3,"Rice"));
		list.add(new Order(4,"Pani Puri"));
		return list;
	}
	@PutMapping("/update")
	public String updateData() {
		return "Putmapping";
	}
	@DeleteMapping("/update")
	public String deleteData() {
		return "DeleteMapping";
	}
}
