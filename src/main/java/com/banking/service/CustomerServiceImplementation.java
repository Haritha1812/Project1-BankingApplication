package com.banking.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.banking.dao.CustomerDAOImplementation;
import com.banking.model.Customer;
import com.banking.dao.CustomerDAO;


public class CustomerServiceImplementation implements CustomerService {
	
CustomerDAO customerDAO = new CustomerDAOImplementation();

@Override
public boolean addAccount(Customer customer) {
	
	return customerDAO.addAccount(customer);
}

@Override
public boolean deleteAccount(int accountNumber) {
	
	return customerDAO.deleteAccount(accountNumber);
}

@Override
public boolean updateAccount(Customer customer) {
	return customerDAO.updateAccount(customer);
}

@Override
public Customer getCustomerById(int customerId) {
return customerDAO.getCustomerById(customerId);
}

@Override
public List<Customer> getCustomers() {
	return customerDAO.getCustomers();
}

@Override
public boolean isCustomerExists(int customerId) {
	return customerDAO.isCustomerExists(customerId);
}

@Override
public int viewBalance(int customerId) {

	return customerDAO.viewBalance(customerId);
}

@Override
public int deposit(int amount , int customerid) {
	return customerDAO.deposit(amount, customerid);
}

@Override
public int withdraw(int amount,int id) {
	
	return customerDAO.withdraw(amount, id);
}

@Override
public int transferAmount(int senderId, int receiverId, int amount) {
	// TODO Auto-generated method stub
	return customerDAO.transferAmount(senderId, receiverId, amount);
}

@Override
public Customer validateAccount(int customerid, String password) {
return customerDAO.validateAccount(customerid, password);
}
	
}
