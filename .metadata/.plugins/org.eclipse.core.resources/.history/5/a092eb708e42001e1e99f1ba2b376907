package com.hdfc.banking.service;

import java.util.List;

import com.hdfc.banking.entity.Transaction;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TransactionServiceImpl implements ITransactionService {

	@Override
	@Transactional
	public Transaction addTransaction(Transaction transaction) {
		transaction.persist();
		return transaction;
	}

	@Override
	public List<Transaction> getAllTransactions() {
		return Transaction.listAll();
	}

}
