package com.spring.web.springstarterweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.web.springstarterweb.model.UserModel;

import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userModel")
@RequestMapping("/MVC-2")
public class MVCController2 {

	@GetMapping
	public String get(@ModelAttribute("user") UserModel message, Model model) {
		model.addAttribute("Controller2", "You are in Controller-2");
		model.addAttribute("message", message.getUserText());
		model.addAttribute("userModel", new UserModel());
		return "view";
	}

	@PostMapping
	public String post(@ModelAttribute("userModel") UserModel userModel, Model model,
			RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", userModel);
		return "redirect:/Rest";
	}

}
