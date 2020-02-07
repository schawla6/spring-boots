package com.mypackage.springconfigjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Configuration file for beans that replaces applicationContext.xml file
//Component scan automatically scans and create beans for classes with @Component annotation
//Manually create and inject beans using @Bean annotation to rule out the use of @ComponentScan and @Component


@Configuration
@ComponentScan("com.mypackage.springconfigjava")
@PropertySource("classpath:sport.properties")
public class SportsConfig {

	//define bean for NeutralFortuneService
	@Bean
	public FortuneService neutralFortuneService() {
		return new NeutralFortuneService();
	}
	
	//define bean for swimCoach and inject dependency of neutralFortuneService
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(neutralFortuneService());	
	}
	
}
