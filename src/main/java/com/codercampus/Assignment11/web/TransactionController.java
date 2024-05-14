package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.domain.TransactionService;


@Controller
public class TransactionController {
	
	
	@Autowired 
	TransactionService transactionService = new TransactionService();
	
	@GetMapping("/transactions")
	public String getAllTransactions() {
		List<Transaction> transactionList = transactionService.sortTransactionList();
		return "transactions";
	}
	
	
}
