package com.example.studentAge.studentAge.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ageController {
	@RequestMapping("/hello")
    public String hello(@RequestParam(value="name") String name
    		,@RequestParam(name="age") int age, Model model) {
				model.addAttribute("age", age);
				model.addAttribute("name", name);
	 return "helloAge";
	}
}
