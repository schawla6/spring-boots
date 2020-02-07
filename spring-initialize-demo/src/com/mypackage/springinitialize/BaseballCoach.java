package com.mypackage.springinitialize;

public class BaseballCoach implements Coach {

	public BaseballCoach() {
		System.out.println("Baseball Coach: Inside Baseball coach no-arg constructor");
	}
	
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
