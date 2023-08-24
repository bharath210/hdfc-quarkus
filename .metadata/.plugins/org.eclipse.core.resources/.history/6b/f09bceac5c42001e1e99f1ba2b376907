package com.hdfc.quarkus.service;

import java.util.List;

import com.hdfc.quarkus.entity.Account;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AccountServiceImpl implements IAccountService{

	@Override
	@Transactional
	public Account addAccount(Account account) {
		account.persist();
		return account;
	}

	@Override
	public List<Account> getCustomerAccount(long custId) {
		// TODO Auto-generated method stub
		return Account.list("customer.id", custId);
	}

}
