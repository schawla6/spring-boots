package com.mypackage.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.mypackage.springaop")
@EnableAspectJAutoProxy
public class Config {

}
