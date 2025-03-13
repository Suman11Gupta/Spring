package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController
{
	/* @RequestMapping("/home1")
	public String home1() 
	{
		System.out.println("Working");
		return "home1.jsp";
	}*/
	
	
	/* @RequestMapping("/home1")
	public String home1(HttpServletRequest req) 
	{
		HttpSession ses=req.getSession();
		String name=req.getParameter("name");
		System.out.println(name+"its working");
		ses.setAttribute("name", name);
		
		return "home1.jsp";
	} */
	
	//localhost:8080/home1?name=suman
	
	/* @RequestMapping("/home1")
	public ModelAndView home(String name)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",name);     --->(name,name)same parameter
		mv.setViewName("home1.jsp");
		
		return mv;
	} */
	
	//localhost:8080/home1?name=suman
	
	/* @RequestMapping("/home1")
	public ModelAndView home(@RequestParam("name") String showname)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",showname);    ---> (name,showname) different parameter
		mv.setViewName("home1.jsp");
		return mv;
	} */
	
	//localhost:8080/home1?name=suman
	
	
	@RequestMapping("/home1")
	public ModelAndView home(Student stud)  //--->student class object
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("stud",stud);
		mv.setViewName("home1.jsp");
		
		return mv;
	}
	
	@RequestMapping("/")
	public String frontpage()
	{
		return "index.jsp";
	}
	
}
