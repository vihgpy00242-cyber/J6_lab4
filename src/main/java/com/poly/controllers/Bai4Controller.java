package com.poly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bai4Controller {
	@RequestMapping("/home/index")
	public String index(Model model) {
	return "/form/home";
	}
	@RequestMapping("/home/about")
	public String about(Model model) {
	return "/form/about";
	}
}
