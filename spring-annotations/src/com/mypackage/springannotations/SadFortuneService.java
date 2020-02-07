package com.mypackage.springannotations;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {
	
	//read fortunes from file	
	@Value("${foo.myfortune}")
	private String myfortune;
	
	private String todaysFortune; 

	//do post-processing of generating a random fortune	
	@PostConstruct
	public void init() {
		Random rnd = new Random();
		String arrfortune[] = myfortune.split(",");
		int index = rnd.nextInt(arrfortune.length);
		todaysFortune = arrfortune[index];
	}
	
	@Override
	public String getFortune() {
		return todaysFortune;
	}

}
