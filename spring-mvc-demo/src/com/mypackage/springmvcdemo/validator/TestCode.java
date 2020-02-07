package com.mypackage.springmvcdemo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = TestCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface TestCode {

	//define default test code
	public String value() default "TEST";
	
	//define default error message
	public String message() default "must start with TEST";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
