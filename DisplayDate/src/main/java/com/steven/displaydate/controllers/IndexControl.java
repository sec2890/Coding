package com.steven.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControl {
	@RequestMapping("/")
	public String index() {
		return "/DisplayDate/index.jsp";
	}
}
