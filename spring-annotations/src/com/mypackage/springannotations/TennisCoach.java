package com.mypackage.springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//creating a bean with default name i.e. tennisCoach
//using autowiring for dependency injection using constructor injection
//used the HappyFortuneService implementation of FortuneService (using @Qualifier("sadFortuneService)) injected through constructor
//initialized and destroyed functions (using @PostConstruct and @PreDestroy)

@Component()
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//define my constructor
	@Autowired
	public TennisCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: Inside doMyStarupStuff function to initialize");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: Inside doMyCleanupStuff function to clean");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Complete tennis training for 1 hour";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
