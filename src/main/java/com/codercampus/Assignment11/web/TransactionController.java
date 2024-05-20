package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;



@Controller
public class TransactionController {
	
	
	@Autowired 
	TransactionService transactionService = new TransactionService();
	
	@GetMapping("/transactions")
	public String getAllTransactions(ModelMap model) {
		List<Transaction> transactionList = transactionService.sortTransactionList();
		model.put("transactions", transactionList);
		return "transactions";
	}
	
	
	@GetMapping("/transactions/{transactionId}")
	public String getTransaction(@PathVariable Long transactionId, ModelMap model) {
		Transaction transaction = transactionService.findById(transactionId);
		model.put("transaction", transaction);
		return "transaction";	
	}
	
	
}
