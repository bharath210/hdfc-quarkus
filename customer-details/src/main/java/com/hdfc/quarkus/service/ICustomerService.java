package com.hdfc.quarkus.service;

import java.util.List;

import com.hdfc.quarkus.entity.Customer;
import com.hdfc.quarkus.exceptions.CustomerNotFoundException;

import jakarta.ws.rs.core.Response;

public interface ICustomerService {
	
	public Customer createCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer fetchCustomerById(long id) throws CustomerNotFoundException;
	public List<Customer> fetchAllCustomers();
	public Response deleteCustomer(long id) throws CustomerNotFoundException;

}
