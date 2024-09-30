package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/welcome")
	public String hello() {
		System.out.println("A");
		return "NewFile";
	}
}
