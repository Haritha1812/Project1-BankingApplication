package com.banking.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.banking.model.Customer;
import com.banking.model.CustomerTransaction;
import com.banking.util.HibernateUtil;

public class CustomerDAOImplementation implements CustomerDAO{
private static Logger logger = Logger.getLogger("CustomerDAOImpl");
	
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	CustomerTransaction customerTransaction ;
	
	CustomerTransactionDAO customerTransactionDAO = new CustomerTransactionImplementation();
	
	@Override
	public boolean addAccount(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteAccount(int customerId) {
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateAccount(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Customer customer =  (Customer) session.load(Customer.class, customerId);
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		
		Query query = session.createQuery("from com.banking.model.Customer");
		List<Customer> customers = query.list();
		System.out.println(customers);
		return customers;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Customer customer =  (Customer) session.get(Customer.class, customerId);
		if(customer ==null)
			return false;
		else
			return true;
	}

	@Override
	public int viewBalance(int customerId) {
		Query query = session.createQuery("select balance from com.banking.model.Customer where customerId = "+customerId);
		int balance = (int) query.list().get(0);
		logger.info("The balance for :"+customerId + " is "+balance);
		return balance;
	}


	@Override
	public int withdraw(int amount,int customerid) {
		//Query query = session.createQuery("update com.banking.model.Customer set balance=balance-"+amount+" where customerId = "+customerid);
		int balance = viewBalance(customerid);
		int res = balance - amount;
		
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("update com.banking.model.Customer set balance=:n where customerId=:i");
		q.setParameter("n",res);
		q.setParameter("i",customerid);

         int status=q.executeUpdate();
         System.out.println(status);
         tx.commit();
         int balancefinal = viewBalance(customerid);
         customerTransaction = new CustomerTransaction(0, customerid, balancefinal, amount,0, 0, new Date(), customerid,customerid);
         customerTransactionDAO.addTransaction(customerTransaction);
         
		 return balancefinal;

	     // customerTransactionDAO.addTransaction(customerTransaction);
	
	}

	@Override
	public int transferAmount(int senderId, int receiverId, int amount) {
	int senbal=	withdraw( amount,senderId);
	int recbal=	deposit(amount , receiverId);
	customerTransaction = new CustomerTransaction(0, senbal,senderId, 0,senderId,receiverId, new Date(),amount, 0);
	customerTransactionDAO.addTransaction(customerTransaction);
		return senbal;
	}
	public Customer validateAccount(int customerid, String password) {
		Customer customer =  (Customer) session.load(Customer.class, customerid);
		return customer;
}

	@Override
	public int deposit(int amount, int customerid) {
		int balance = viewBalance(customerid);
		int res = balance +amount;
		
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("update com.banking.model.Customer set balance=:n where customerId=:i");
		q.setParameter("n",res);
		q.setParameter("i",customerid);

int status=q.executeUpdate();
System.out.println(status);
tx.commit();
int balancefinal = viewBalance(customerid);
customerTransaction = new CustomerTransaction(0,customerid, balancefinal, 0,amount,  0, new Date(), customerid, customerid);
customerTransactionDAO.addTransaction(customerTransaction);

		return balancefinal;  
	}
}