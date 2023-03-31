package com.spring.ioc;

//practice activity #1


public class FootballCoach implements Coach {

	String instruction="practice goal daily 1hr";
	
	@Override
	public String getDailyWorkout() {
		
		return instruction;
	}

}
