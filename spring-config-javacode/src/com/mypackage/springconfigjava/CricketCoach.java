package com.mypackage.springconfigjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//creating bean with default name i.e. cricketCoach (using @Component())
//using autowiring for dependency injection using field injection (usng @AutoWired)
//used the SadFortuneService implementation of FortuneService (using @Qualifier("randomFortuneService)) through field injection

@Component()
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	public FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside Cricket no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 45 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
