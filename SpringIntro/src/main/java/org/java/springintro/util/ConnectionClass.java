package org.java.springintro.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionClass {
	private static EntityManagerFactory factory;
	private ConnectionClass() {
		// TODO Auto-generated constructor stub
	}
	public static EntityManagerFactory getEntityManagerFactory() {
		if(factory==null) factory=Persistence.createEntityManagerFactory("ganesh");
		return factory;
	}
}
