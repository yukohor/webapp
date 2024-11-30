package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MenuController {
	
	//目ゆー画面表示
	@GetMapping
	public String showMenu() {
		return "menu";
	}

}
