package com.hdfc.quarkus.service;

import java.util.List;

import com.hdfc.quarkus.entity.Customer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CustomerServiceImpl implements ICustomerService {

	@Override
	@Transactional
	public Customer addCustomer(Customer customer) {
		Customer.persist(customer);
		return customer;
	}

	@Override
	public Customer fetchCustomerById(long id) {
		return Customer.findById(id);
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		return Customer.listAll();
	}

}
