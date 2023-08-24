package com.hdfc.banking.service;

import java.util.List;

import com.hdfc.banking.entity.Account;

public interface IAccountService {
	
	public Account addAccount(Account account);
	public List<Account> getCustomerAccount(long custId);

}
