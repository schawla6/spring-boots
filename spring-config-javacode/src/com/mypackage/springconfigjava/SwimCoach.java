package com.mypackage.springconfigjava;

//creating a bean with default name i.e. tennisCoach
//using autowiring for dependency injection using constructor injection
//used the HappyFortuneService implementation of FortuneService (using @Qualifier("sadFortuneService)) injected through constructor
//initialized and destroyed functions (using @PostConstruct and @PreDestroy)

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	//define my constructor
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Complete 4 laps of swim in 14 minutes";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
