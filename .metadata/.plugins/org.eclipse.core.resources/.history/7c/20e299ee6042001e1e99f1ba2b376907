package com.hdfc.quarkus.controller;

import java.util.List;

import com.hdfc.quarkus.entity.Account;
import com.hdfc.quarkus.service.IAccountService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountController {
	
	@Inject
	IAccountService accountService;
	
	@POST
	@Path("/add")
	public Account add(Account account) {
		return accountService.addAccount(account);
	}
	
	@GET
	@Path("/cust/{id}")
	public List<Account> getAccountsByCustomerId(@PathParam("id") long id){
		return accountService.getCustomerAccount(id);
	}

}
