package com.mypackage.springinitialize;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] arr = {"Today is your lucky day", "Today you have to work hard", "Today is going to be a helpful day"};
		int rnd = new Random().nextInt(arr.length);
	    return arr[rnd];
	}
}
