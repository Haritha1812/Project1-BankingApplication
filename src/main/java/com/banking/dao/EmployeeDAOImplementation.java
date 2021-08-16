package com.banking.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.banking.model.Employee;
import com.banking.util.HibernateUtil;
import com.banking.model.Customer;

public class EmployeeDAOImplementation implements EmployeeDAO {
private static Logger logger = Logger.getLogger("CustomerDAOImpl");
	
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	@Override
	public boolean addEmployeeAccount(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteEmployeeAccount(int employeeId) {
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		session.delete(employee);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateEmployeeAccount(Employee employee) {
		Transaction transaction = session.beginTransaction();
		session.update(employee);
		transaction.commit();
		return true;
	}
	@Override
	public Employee validateAccount(int employeeId, String employeePassword) {
    Employee employee = (Employee) session.get(Employee.class, employeeId);
     return employee;
	}

	@Override
	public Employee viewEmployeeAccount(int employeeId) {
		//Customer customer =  (Customer) session.load(Customer.class, customerId);
	//	return customer;
		Employee employee = (Employee) session.get(Employee.class, employeeId);
		return employee;
	}

	
	@Override
	public void getAllUserDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllUserDetailsByList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void viewTransactionDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewStatementOfUserById(int accountnumber) {
		// TODO Auto-generated method stub
		
	}
	
}	


	
	
