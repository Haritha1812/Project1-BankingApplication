package com.banking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Employeetable")
public class Employee implements Serializable {

       @Id
		private int employeeId;
       @Column
		private String employeeName;
       @Column
		private String employeePhoneNumber;
       @Column
		private String employeePassword;
       @Column
		private String emailId;
       @Column
		private String salary;
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeePhoneNumber() {
			return employeePhoneNumber;
		}
		public void setEmployeePhoneNumber(String employeePhoneNumber) {
			this.employeePhoneNumber = employeePhoneNumber;
		}
		public String getEmployeePassword() {
			return employeePassword;
		}
		public void setEmployeePassword(String employeePassword) {
			this.employeePassword = employeePassword;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int employeeId, String employeeName, String employeePhoneNumber, String employeePassword,
				String emailId, String salary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeePhoneNumber = employeePhoneNumber;
			this.employeePassword = employeePassword;
			this.emailId = emailId;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "\n Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhoneNumber="
					+ employeePhoneNumber + ", employeePassword=" + employeePassword + ", emailId=" + emailId
					+ ", salary=" + salary + "]";
		}
		
		
		
}