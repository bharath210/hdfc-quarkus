package com.hdfc.quarkus.service;

import java.util.List;

import com.hdfc.quarkus.entity.Customer;
import com.hdfc.quarkus.exceptions.CustomerNotFoundException;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CustomerServiceImpl implements ICustomerService {

	@Override
	@Transactional
	public Customer createCustomer(Customer customer) {
		Customer.persist(customer);
		return customer;
	}

	@Override
	public Customer fetchCustomerById(long id) throws CustomerNotFoundException {
		Customer customer = Customer.findById(id);
		if (customer == null){
			throw new CustomerNotFoundException("Customer not found with id : " + id);
		}

		return customer;
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		return Customer.listAll();
	}

	@Override
	@Transactional
	public Customer updateCustomer(Customer customer) {
		Customer cust = Customer.findById(customer.id);
		cust.setFirstName(customer.getFirstName());
		cust.setLastName(customer.getLastName());
		cust.setDateOfBirth(customer.getDateOfBirth());
		cust.setEmail(customer.getEmail());
		cust.setAddress(customer.getAddress());
		cust.setFamilyDetail(customer.getFamilyDetail());
		cust.setProfessionalDetail(customer.getProfessionalDetail());
		cust.persistAndFlush();
		return cust;
	}

	@Override
	@Transactional
	public Response deleteCustomer(long id) throws CustomerNotFoundException {
		Customer customer = Customer.findById(id);
		if (customer == null){
			throw new CustomerNotFoundException("Customer not found with id : " + id);
		}
		boolean isDeleted = Customer.deleteById(id);
		if(!isDeleted) {
			return Response.status(Response.Status.BAD_REQUEST).entity("Error occured while deleting customer").build();
		}
		return Response.status(Response.Status.OK).entity("Customer deleted").build();
		
	}

}
