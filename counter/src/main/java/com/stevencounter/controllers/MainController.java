package com.stevencounter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("")
	public String home(HttpSession session) {
		if(session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count", count);
		}
		Integer count = (Integer) session.getAttribute("count");
		session.setAttribute("count", count+1);
		return "main.jsp";
	}

	
	@RequestMapping("/counter")
	public String count(HttpSession session) {
		if(session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count", count);
		}
		return "counterpage.jsp";
	}

	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", null);
		return "redirect:/counter";
	}

	
	@RequestMapping("/two")
	public String addtwo(HttpSession session) {
		if(session.getAttribute("count") == null) {
			Integer count = 2;
			session.setAttribute("count", count);
		}
		Integer count = (Integer) session.getAttribute("count");
		session.setAttribute("count", count+2);
		return "redirect:/counter";
	}

}
