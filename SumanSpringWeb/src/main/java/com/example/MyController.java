package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController
{
	@RequestMapping("/home1")
	public String home1() 
	{
		System.out.println("Working");
		return "home1.jsp";
	}
}
