package com.banking.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.banking.model.Employee;
import com.banking.service.EmployeeService;
import com.banking.service.EmployeeServiceImplementation;

public class EmployeeDAOImplementationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddEmployeeAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteEmployeeAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployeeAccount() {
	Employee employee = new Employee(5,"2r23","Pr", "132", "3252325", "8888");
	EmployeeService employeeService = new EmployeeServiceImplementation();
	employeeService.updateEmployeeAccount(employee);
	}

	@Test
	public void testValidateAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewEmployeeAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllUserDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllUserDetailsByList() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewTransactionDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewStatementOfUserById() {
		fail("Not yet implemented");
	}

}
