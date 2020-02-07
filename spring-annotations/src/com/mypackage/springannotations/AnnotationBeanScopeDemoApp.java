package com.mypackage.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach volCoach = context.getBean("volleyBallCoach", Coach.class);
		Coach alpvolCoach = context.getBean("volleyBallCoach", Coach.class);
		System.out.println("");
		
		//check if they are equal
		System.out.println("Are tennis coach objects equal: "+(theCoach == alphaCoach)); //returns true (singleton scope)
		System.out.println("Memory location for theCoach: "+theCoach);
		System.out.println("Memory location for alphaCoach: "+alphaCoach);
		System.out.println("");
		System.out.println("Are volleyball coach objects equal: "+(volCoach == alpvolCoach)); //returns false (prototype scope)
		System.out.println("Memory location for volCoach: "+volCoach);
		System.out.println("Memory location for alpvolCoach: "+alpvolCoach);
		
		//close context
		context.close();
	}

}
