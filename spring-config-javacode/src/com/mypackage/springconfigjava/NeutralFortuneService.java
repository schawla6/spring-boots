package com.mypackage.springconfigjava;

import org.springframework.stereotype.Component;

@Component
public class NeutralFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today's day will be neutral";
	}

}
