package com.hdfc.banking.service;

import com.hdfc.banking.entity.Account;
import com.hdfc.banking.vo.AccountVO;

public interface IAccountService {
	
	public AccountVO createAccount(Account account);
	public AccountVO getAccountById (long id);

}
