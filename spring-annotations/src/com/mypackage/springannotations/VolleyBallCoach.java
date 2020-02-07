package com.mypackage.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//creating bean with default name i.e. volleyBallCoach
//using autowiring for dependency injection using field injection 
//i.e. using autowired directly on field without any constructor or setter method
//used the HappyFortuneService implementation of FortuneService (using @Qualifier("happyFortuneService)) injected through field
//create diiferent beans everytime object is create (using @Scope("prototype"), default is "singleton")

@Component()
@Scope("prototype")
public class VolleyBallCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	public FortuneService fortuneService;
	
	public VolleyBallCoach() {
		System.out.println("Inside Volley no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice volleyball for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
