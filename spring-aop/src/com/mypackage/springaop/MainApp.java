package com.mypackage.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mypackage.springaop.dao.AccountDAO;

public class MainApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		accountDAO.addAccount();
		accountDAO.addAccount();
		
		// close the context
		context.close();
	}

}
