package com.hdfc.quarkus.controller;

import java.util.List;

import com.hdfc.quarkus.entity.Customer;
import com.hdfc.quarkus.exceptions.CustomerNotFoundException;
import com.hdfc.quarkus.service.ICustomerService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerController {
	
	@Inject
	ICustomerService customerService;
	
	@POST
	public Customer addCustomer(Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	@GET
	@Path("/{id}")
	public Customer getCustomer(@PathParam("id") long id) throws CustomerNotFoundException {
		return customerService.fetchCustomerById(id);
	}
	
	@GET
	public List<Customer> getAllCustomers(){
		return customerService.fetchAllCustomers();
	}
	
	@PUT
	public Customer updateCustomer(Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@DELETE
	@Path("/{id}")
	public Response deleteCustomer(@PathParam("id") long id) throws CustomerNotFoundException {
		return customerService.deleteCustomer(id);
	}

}
