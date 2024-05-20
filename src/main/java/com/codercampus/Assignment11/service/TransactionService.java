package com.codercampus.Assignment11.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
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

	public Transaction findById(Long transactionId) {
		 List<Transaction> transactionList = transactionRepo.findAll();
						return transactionList.stream()
										      .filter(transaction -> transaction.getId().equals(transactionId))
										      .findAny()
										      .orElse(null);
		
	}

}
