package com.hdfc.banking.service;

import java.util.List;

import com.hdfc.banking.entity.Account;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AccountServiceImpl implements IAccountService{
	
	
	@Override
	@Transactional
	public Account createAccount(Account account) {
		Account.persist(account);
		return account;
	}

	@Override
	public List<Account> getCustomerAccount(long custId) {
		
		return Account.list("custId", custId);
	}

	@Override
	@Transactional
	public Account updateBalance(String accNum, double balance) {
		Account account = Account.find("accNumber", accNum).firstResult();
		account.setBalance(balance);
		account.persistAndFlush();
		return account;
	}


}
