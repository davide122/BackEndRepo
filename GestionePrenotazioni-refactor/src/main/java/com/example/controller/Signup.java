package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Signup {
@GetMapping("/login")
public ModelAndView Showformlogin() {
	return new ModelAndView("login");
}



@GetMapping("/register")
public ModelAndView ShowformReg() {
	return new ModelAndView("register");
}
}
