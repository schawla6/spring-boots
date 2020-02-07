package com.mypackage.springconfigjava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach basCoach = context.getBean("theBasketballCoach", Coach.class);
		Coach volCoach = context.getBean("volleyBallCoach", Coach.class);
		Coach cricCoach = context.getBean("cricketCoach", Coach.class);
		Coach swimCoach = context.getBean("swimCoach", Coach.class);
		System.out.println("");
		
		//call the methods using bean
		System.out.println("Tennis Coach says: "+theCoach.getDailyWorkout());
		System.out.println("Tennis Coach tells fortune: "+theCoach.getDailyFortune());
		System.out.println("");
		System.out.println("BasketBall Coach says: "+basCoach.getDailyWorkout());
		System.out.println("BasketBall Coach tells fortune: "+basCoach.getDailyFortune());
		System.out.println("");
		System.out.println("VolleyBall Coach says: "+volCoach.getDailyWorkout());
		System.out.println("VolleyBall Coach tells fortune: "+volCoach.getDailyFortune());
		System.out.println("");
		System.out.println("Cricket Coach says: "+cricCoach.getDailyWorkout());
		System.out.println("Cricket Coach tells fortune: "+cricCoach.getDailyFortune());
		System.out.println("");
		System.out.println("Swim Coach says: "+swimCoach.getDailyWorkout());
		System.out.println("Swim Coach tells fortune: "+swimCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
