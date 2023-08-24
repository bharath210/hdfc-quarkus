package com.hdfc.banking.service;

import java.util.List;

import com.hdfc.banking.entity.Transaction;

import jakarta.ws.rs.core.Response;

public interface ITransactionService {
	
	public Response addTransaction(Transaction transaction);
	public List<Transaction> getAllTransactions();

}
