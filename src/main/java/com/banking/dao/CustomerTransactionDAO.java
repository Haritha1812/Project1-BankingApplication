package com.banking.dao;

import java.util.List;

import com.banking.model.CustomerTransaction;

public interface CustomerTransactionDAO {
	 public int addTransaction(CustomerTransaction customerTransaction);
	    public List<CustomerTransaction> getCustomerTransactionById(int customerTransaction);
	    public List<CustomerTransaction> getAllCustomerTransaction();
}
