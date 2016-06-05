package com.mario.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
//@SessionAttributes({"resultado","mensaje"})
@SessionAttributes("resultado")
public class IndexController {
	
	
	@RequestMapping("/")
	public String showIndex(Model model) {
		
		model.addAttribute("resultado", "resultado de session");
		
		return "index";
	}

	@RequestMapping("/about")
	public String showAbout(SessionStatus sessionStatus) {
		
		sessionStatus.setComplete();
		
		return "about";
	}
	
	@RequestMapping("/admin")
	public String showAdmin(Model model) {
		
		model.addAttribute("mensaje", "mensaje del Model");
		
		return "admin";
	}
	
}
