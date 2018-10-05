package com.example.hello.helloAge.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hello.helloAge.domain.HelloThymeleafApplication;

@Controller
@ResponseBody	
public class MessageController {
	 @RequestMapping("/hello")
	    public String hello(@RequestParam(value="name") String name
	    		,@RequestParam(name="age") int age) {
		 	String result;
		 	if(age >= 18){
		 		result = "Welcome " + name;
		 	}else{
		 		result = "Your are too young";
		 	}
		 return result;
	    }
	 	@RequestMapping("/bye")
	 	public String bye(@RequestParam(value="location") String location
 			,@RequestParam(name="name") String name) {
 		return "Welcome to the  " + location + " " +name;
	 	}
	 	@RequestMapping("/contact")
    	public String contact() {
    		return "This is the contact page";
    }
}
