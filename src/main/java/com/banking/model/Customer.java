package com.banking.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "customertable")
@NamedQueries({
	@NamedQuery(name = "viewallcustomers" , query = "FROM Customer C"),
	@NamedQuery(name = "findCustomerById" ,query = "From Customer  where customerId = :id"),
	 @NamedQuery(name = "findCustomerByName" ,query = "From Customer C where C.customerName = :name"),
})

public class Customer implements Serializable {
	
	
	@Id
	
	private int customerId;
	
	@Column
	private String password;
	
	@Column
	private String customerName;
	@Column
	private int balance;
	@Column
	private String mobilenumber;
	@Column
	private String emailId;
	@Column
	private Date registrationdate;
	@Column
	private Date updatedDate;
	

	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getRegistrationdate() {
		return registrationdate;
	}
	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", password=" + password + ", customerName=" + customerName
				+ ", balance=" + balance + ", mobilenumber=" + mobilenumber + ", emailId=" + emailId
				+ ", registrationdate=" + registrationdate + ", updatedDate=" + updatedDate + "]";
	}
	public Customer(int customerId, String password, String customerName, int balance, String mobilenumber,
			String emailId, Date registrationdate, Date updatedDate) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.customerName = customerName;
		this.balance = balance;
		this.mobilenumber = mobilenumber;
		this.emailId = emailId;
		this.registrationdate = registrationdate;
		this.updatedDate = updatedDate;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}