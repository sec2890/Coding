package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoNinjaService;

@Controller
public class NinjaController {
	private final DojoNinjaService dojoNinjaService;
	
	public NinjaController(DojoNinjaService dojoNinjaService) {
		this.dojoNinjaService = dojoNinjaService;
	}

	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninjaObject") Ninja Ninja, Model model) {
		model.addAttribute("dojos", dojoNinjaService.getAllDojos());
		return "/DojosAndNinjas/newninja.jsp";
	}
	
	@PostMapping("/addninja")
	public String addNinja(@Valid @ModelAttribute("ninjaObject") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/DojosAndNinjas/newninja.jsp";
		}
		else {
			dojoNinjaService.addNinja(ninja);
			return "redirect:/dojos/" + ninja.getDojo().getId() ;
		}
	}
}