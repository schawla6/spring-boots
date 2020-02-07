package com.mypackage.springmvcdemo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TestCodeConstraintValidator 
	implements ConstraintValidator<TestCode, String>{

	private String testPrefix;
	
	@Override
	public void initialize(TestCode testCode) {
		testPrefix = testCode.value();
	}
	
	@Override
	public boolean isValid(String input, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result;
		
		if(input != null) {
		result = input.startsWith(testPrefix);
		}
		else {
			return false;
		}
		return result;
	}

}
