package com.spring.web.springstarterweb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.web.springstarterweb.model.UserModel;

import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("userModel")
@RequestMapping(path = "/Rest", produces = "application/json")
@CrossOrigin(origins = "*")
public class RestMVCController {

	@GetMapping
	public UserModel get(@ModelAttribute("message") UserModel user, SessionStatus sessionStatus) {

		// cleans up the stored
		// session attributes (data)
		sessionStatus.setComplete();
		return user;
	}
}
