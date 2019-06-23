package com.steven.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SuccessControl {
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String success(@RequestParam(value="code") String code, RedirectAttributes errormsg) {
		if(code.equals("bushido")) {
			return "/TheCode/code.jsp";			
		}
		else {
	        errormsg.addFlashAttribute("error", "You must train harder!");
	        return "redirect:/";
		}
	}	
}