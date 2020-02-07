package com.mypackage.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		
		System.out.println(getClass() + ": Adding an Account");
	}
}
