package com.steven.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyControl {
	@RequestMapping("/")
	public String survey() {
		return "/DojoSurvey/survey.jsp";
	}
}