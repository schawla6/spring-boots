package com.mypackage.springconfigjava;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//sets value of filefortune from sports.properties file (foo.fortune field)
//returns random fortune from array

@Component
public class RandomFortuneService implements FortuneService {

	@Value("${foo.fortune}")
	private String filefortune;
	
	private Random rnd = new Random();
	
	@Override
	public String getFortune() {
		String arrfortune[] = filefortune.split(",");
		int index = rnd.nextInt(arrfortune.length);
		
		return arrfortune[index];
	}
	
	
}
