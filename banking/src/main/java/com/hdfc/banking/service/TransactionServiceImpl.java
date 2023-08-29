package com.hdfc.banking.service;

import java.util.List;

import com.hdfc.banking.entity.Account;
import com.hdfc.banking.entity.Transaction;
import com.hdfc.banking.enums.TransactionType;
import com.hdfc.banking.vo.TransactionVO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class TransactionServiceImpl implements ITransactionService {
	
	
	@Inject
	IAccountService accountService;
	


	@Override
	@Transactional
	public Response addTransaction(Transaction transaction) {
		Account account = Account.find("accNumber", transaction.getAccNumber()).firstResult();
		double bal = account.getBalance();
		if(transaction.getTxType().equals(TransactionType.CREDIT)) {
			bal = bal + transaction.getAmount();
		}else if (transaction.getTxType().equals(TransactionType.DEBIT)) {
			bal = bal - transaction.getAmount();
			if(bal < 0) {
				return Response.status(Response.Status.BAD_REQUEST).entity("Not enough balance to withdraw amount").build();
			}
		}
		transaction.setCustId(account.getCustId());
		account.setBalance(bal);
		account.persistAndFlush();
		transaction.persist();
		TransactionVO transactionVO = new TransactionVO();
		transactionVO.setId(transaction.id);
		transactionVO.setAmount(transaction.getAmount());
		transactionVO.setTxNum(transaction.getTxNum());
		transactionVO.setTxType(transaction.getTxType());
		
		transactionVO.setAccount(accountService.getAccountById(account.id));
		return Response.status(Response.Status.OK).entity(transactionVO).build();
	}

	@Override
	public List<Transaction> getAllTransactions() {
		return Transaction.listAll();
	}

}
