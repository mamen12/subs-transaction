package com.api.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.transaction.repository.TransactionRepository;
import com.api.transaction.service.ITransactionService;

@Service
public class TransactionServiceImpl implements ITransactionService{

	@Autowired
	private TransactionRepository transactionRepository;
	
	
}
