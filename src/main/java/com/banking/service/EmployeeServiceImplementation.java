package com.banking.service;

import java.util.List;

import com.banking.dao.EmployeeDAO;
import com.banking.dao.EmployeeDAOImplementation;
import com.banking.model.Customer;
import com.banking.model.Employee;

public class EmployeeServiceImplementation implements EmployeeService{
EmployeeDAO employeeDAO = new EmployeeDAOImplementation();
	@Override
	public boolean addEmployeeAccount(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployeeAccount(employee);
	}

	@Override
	public boolean deleteEmployeeAccount(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.deleteEmployeeAccount(employeeId);
	}

	@Override
	public boolean updateEmployeeAccount(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployeeAccount(employee);
	}

	@Override
	public Employee validateAccount(int employeeId, String employeePassword) {
		// TODO Auto-generated method stub
		return employeeDAO.validateAccount(employeeId, employeePassword);
	}

	@Override
	public Employee viewEmployeeAccount(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.viewEmployeeAccount(employeeId);
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
