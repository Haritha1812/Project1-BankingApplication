package com.banking.service;

import java.util.List;

import com.banking.model.Customer;

public interface CustomerService {
	public boolean addAccount(Customer customer);
	public boolean deleteAccount(int accountNumber);
	
	public boolean updateAccount(Customer customer);
	public Customer getCustomerById(int customerId);
	public List<Customer> getCustomers();
	public boolean isCustomerExists(int customerId);
	public Customer validateAccount(int customerid, String password);
	//* As a customer, I can view the balance of a specific account. * 
	public int viewBalance(int customerId);
	
	//As a customer, I can make a withdrawal or deposit to a specific/my account. 
	public int deposit(int amount,int id);
	public int withdraw(int amount,int id);
	//			1019		1918		6000
	public int transferAmount(int senderId,int receiverId,int amount);
	
}
