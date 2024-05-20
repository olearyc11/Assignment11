package com.codercampus.Assignment11.service;

import java.time.LocalDateTime;
import java.util.Comparator;

import com.codercampus.Assignment11.domain.Transaction;


public class TransactionComparator implements Comparator<Transaction> {

	@Override
	public int compare(Transaction o1, Transaction o2) {

		if (o1 == null && o2 == null) {
			return 0;
		} else if (o1 == null) {
			return 1;
		} else if (o2 == null) {
			return -1;
		}

		LocalDateTime date1 = o1.getDate();
		LocalDateTime date2 = o2.getDate();

		if (date1 == null && date2 == null) {
			return 0;
		} else if (date1 == null) {
			return 1;
		} else if (date2 == null) {
			return -1;
		}

		return date1.compareTo(date2);
	}

}
