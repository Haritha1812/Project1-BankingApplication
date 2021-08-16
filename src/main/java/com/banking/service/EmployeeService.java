package com.banking.service;

import java.util.ArrayList;
import java.util.List;

import com.banking.model.Customer;
import com.banking.model.Employee;

public interface EmployeeService {
	List<Employee> users = new ArrayList<Employee>();
	Employee employee = new Employee();
	public boolean addEmployeeAccount(Employee employee);
	public boolean deleteEmployeeAccount(int employeeId);
	public boolean updateEmployeeAccount(Employee employee);
	public Employee validateAccount(int employeeId, String employeePassword);
	public Employee viewEmployeeAccount(int employeeId);
	public void getAllUserDetails();
	public List<Customer> getAllUserDetailsByList();
	public void viewTransactionDetails();
	public void viewStatementOfUserById(int accountnumber);
	
}
