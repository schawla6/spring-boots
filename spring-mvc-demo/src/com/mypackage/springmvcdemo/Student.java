package com.mypackage.springmvcdemo;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mypackage.springmvcdemo.validator.TestCode;

public class Student {

	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;
	
	private String country;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String language;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String operatingSystem;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Min(value = 0, message = "must be greater or equal to zero")
	@Max(value = 10, message = "must be less than or equal to ten")
	private String questionSolved;
	
	
	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters allowed")
	private String zipCode;
	
	@NotNull(message = "is required")
	@Pattern(regexp = "^[A-Z0-9]{8}", message = "only 8 characters allowed")
	@TestCode(value = "TEST", message = "must start with TEST")
	private String testCode;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("France", "France");
		countryOptions.put("US", "United States");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("CA", "Canada");
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public String getQuestionSolved() {
		return questionSolved;
	}
	public void setQuestionSolved(String questionSolved) {
		this.questionSolved = questionSolved;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getTestCode() {
		return testCode;
	}
	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	
}
