package com.example.HaagaStudent.HaagaStudent.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class controller {
	@GetMapping("/hello")
    public String hello(Model model) {
				String[] student = {"Michael Jordan", "Kobe Bryant", "Lebron James"};
				model.addAttribute("student", student);
	 return "student";
	}

}
