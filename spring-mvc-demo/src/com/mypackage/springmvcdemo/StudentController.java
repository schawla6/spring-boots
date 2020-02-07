package com.mypackage.springmvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a new student object
		Student theStudent = new Student();
		
		//add student object as model attribute
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent,
							  BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}
		
		System.out.println("FirstName is " +theStudent.getFirstName());
		System.out.println("LastName is " +theStudent.getLastName());
		System.out.println("Student is "+theStudent.getFirstName()+" "+theStudent.getLastName());
		System.out.println("Country is " +theStudent.getCountry());
		System.out.println("Language is "+theStudent.getLanguage());
		System.out.println("OS is "+theStudent.getOperatingSystem());
		return "student-confirmation";
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
		
	}
	
}
