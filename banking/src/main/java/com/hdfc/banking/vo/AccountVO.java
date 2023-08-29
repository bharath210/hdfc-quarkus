package com.hdfc.banking.vo;

import com.hdfc.banking.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountVO {
	
	private long id;
	private String accNumber;
	private AccountType accType;
	private double balance;
	private CustomerVO customer;


}
