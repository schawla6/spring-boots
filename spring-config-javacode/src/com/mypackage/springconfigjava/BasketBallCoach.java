package com.mypackage.springconfigjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//creating bean with explicitly defined bean id i.e. theBasketballCoach
//using autowiring for dependency injection using setter injection
//used the HappyFortuneService implementation of FortuneService (using @Qualifier("happyFortuneService)) injected through setter method

@Component("theBasketballCoach")
public class BasketBallCoach implements Coach {

	public FortuneService fortuneService;
	
	public BasketBallCoach() {
		System.out.println("Inside BasketBall no-arg constructor");
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 3 pointers for 20 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
