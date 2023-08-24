package com.hdfc.banking.contoller;

import java.util.List;

import com.hdfc.banking.entity.Transaction;
import com.hdfc.banking.service.ITransactionService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/transaction")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransactionController {
	
	@Inject
	ITransactionService transactionService;
	
	@POST
	@Path("/add")
	public Transaction addTransaction(Transaction transaction) {
		return transactionService.addTransaction(transaction);
	}
	
	@GET
	@Path("/getall")
	public List<Transaction> getAllTransactions(){
		return transactionService.getAllTransactions();
	}

}
