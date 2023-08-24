package com.hdfc.banking.service;

import java.util.List;

import com.hdfc.banking.entity.Account;
import com.hdfc.banking.enums.AccountType;

public interface IAccountService {
	
	public Account createAccount(Account account);
	public List<Account> getCustomerAccount(long custId);
	public Account updateBalance(String accNum, double balance);
	

}
