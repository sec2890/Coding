package com.steven.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateControl {
	@RequestMapping("/date")
	public String date(Model model) {
		String datePattern = "EEEEE, dd MMMMM, yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
		String date = dateFormat.format(new Date());	
		model.addAttribute("date", date);
		return "/DisplayDate/date.jsp";
	}
}


// Date specifiedDate = new SimpleDateFormat("dd.MM.yyyy").parse("YourInputValueHere");
