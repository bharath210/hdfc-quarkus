package com.hdfc.banking.contoller;

import com.hdfc.banking.entity.Account;
import com.hdfc.banking.service.IAccountService;
import com.hdfc.banking.vo.AccountVO;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountController {
	
	@Inject
	IAccountService accountService;
	
	@POST
	public AccountVO create(Account account) {
		return accountService.createAccount(account);
	}
	
//	@GET
//	@Path("/cust/{id}")
//	public List<Account> getAccountsByCustomerId(@PathParam("id") long id){
//		return accountService.getCustomerAccount(id);
//	}

}
