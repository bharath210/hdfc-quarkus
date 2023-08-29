package com.hdfc.banking.service;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hdfc.banking.entity.Account;
import com.hdfc.banking.proxy.CustomerProxy;
import com.hdfc.banking.vo.AccountVO;
import com.hdfc.banking.vo.CustomerVO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AccountServiceImpl implements IAccountService{
	

	
	@RestClient
	@Inject
	CustomerProxy proxy;
	
	
	@Override
	@Transactional
	public AccountVO createAccount(Account account) {
		Account.persist(account);
		CustomerVO customerVO = proxy.getCustomer(account.getCustId());
		AccountVO accountVO = new AccountVO();
		accountVO.setId(account.id);
		accountVO.setAccNumber(account.getAccNumber());
		accountVO.setAccType(account.getAccType());
		accountVO.setBalance(account.getBalance());
		accountVO.setCustomer(customerVO);
		return accountVO;
	}


	@Override
	public AccountVO getAccountById(long id) {
		Account account = Account.findById(id);
		CustomerVO customerVO = proxy.getCustomer(account.getCustId());
		AccountVO accountVO = new AccountVO();
		accountVO.setId(account.id);
		accountVO.setAccNumber(account.getAccNumber());
		accountVO.setAccType(account.getAccType());
		accountVO.setBalance(account.getBalance());
		accountVO.setCustomer(customerVO);

		return accountVO;
	}


}
