package com.codercampus.Assignment11.domain;

import java.util.Collections;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepo = new TransactionRepository();
	
	public List<Transaction> sortTransactionList() {
		List<Transaction> transactionList = transactionRepo.findAll();
		Collections.sort(transactionList, new TransactionComparator());
		return transactionList;
	}
	
	
}
