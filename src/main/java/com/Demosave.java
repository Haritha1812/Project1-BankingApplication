package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.banking.model.Customer;
import com.banking.util.HibernateUtil;

public class Demosave {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.getNamedQuery("viewallcustomers");
		
		List<Customer> customers = query.list();
		for(Customer customer: customers) {
			System.out.println(customer);
		}

	}

}
