package com.mypackage.springmvcdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//controller to show initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller to parse form data
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormAgain")
	public String capitalizeName(@RequestParam("studentName") String studentName, Model model) {
		
		String myName = studentName.toUpperCase();
		
		String result = "Yo! "+ myName;
		
		model.addAttribute("message", result);
		model.addAttribute("question", "How are you?");
		
		return "helloworldagain";
		
	}
	
}
