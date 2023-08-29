package com.hdfc.banking.vo;

import com.hdfc.banking.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionVO {
	
	private long id;
	private String txNum;
	private TransactionType txType;
	private long amount;
	private AccountVO account;

}
