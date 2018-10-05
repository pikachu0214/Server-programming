package com.example.helloStudent.helloStudent.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class welcomePage {
	@RequestMapping("/hello")
	public String hello() {
	 		String[] arr = {"John Smith", "Michael Jordan", "Lebron James"};
	 		return "Welcome to Haaga-Helia \n" + student(arr);
	}

	public static String student(String[] n) {
	String sum = " ";
	int i;
	for (i = 0; i < n.length; i++) {
		sum += n[i];
	}
	return sum + " \n ";
	}

}