package com.hdfc.quarkus.controller;

import java.util.List;

import com.hdfc.quarkus.entity.Customer;
import com.hdfc.quarkus.service.ICustomerService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerController {
	
	@Inject
	ICustomerService customerService;
	
	@POST
	@Path("/add")
	public Customer addCustomer(Customer customer) {
		customerService.addCustomer(customer);
		return customer;
	}
	
	@GET
	@Path("/get/{id}")
	public Customer getCustomer(@PathParam("id") Long id) {
		return customerService.fetchCustomerById(id);
	}
	
	@GET
	@Path("/get/all")
	public List<Customer> getAllCustomers(){
		return customerService.fetchAllCustomers();
	}

}
