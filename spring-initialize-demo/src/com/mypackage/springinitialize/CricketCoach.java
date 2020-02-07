package com.mypackage.springinitialize;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method for fortune dependency");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Bowl 10 overs";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+fortuneService.getFortune();
	}
}
