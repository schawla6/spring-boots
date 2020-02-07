package com.mypackage.springinitialize;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("Memory Location of the theCoach: "+theCoach);
		System.out.println("Memory Location of the alphaCoach: "+alphaCoach);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("Are the two references pointing to same object: "+result);
		
		//close context
		context.close();
	}

}
