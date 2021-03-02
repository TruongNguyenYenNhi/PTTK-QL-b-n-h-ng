package com.hibernate.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.utils.HibernateUntils;

public class Main {
	 static final SessionFactory factory = HibernateUntils.getSessionFactory();
	 public static void main(String[] args) {
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 //tạo user
		 User u = new User();
		
		 u.setUsername("1221");
		 u.setPassword("1221");
		 session.save(u);
		 
		 tx.commit();
	 }
}
