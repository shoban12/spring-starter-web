package com.spring.web.springstarterweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.web.springstarterweb.model.UserModel;

@Controller
@SessionAttributes("userModel")
@RequestMapping("MVC-1")
public class MVCController1 {

	@GetMapping
	public String get(Model model) {
		model.addAttribute("Controller1", "You are in Controller-1");
		model.addAttribute("userModel", new UserModel());
		return "view";
	}

	@PostMapping
	public String post(@ModelAttribute("userModel") UserModel userModel, Model model,
			RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("user", userModel);
		return "redirect:/MVC-2";
	}
}
