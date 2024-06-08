package com.practice.spring_mvc_thymeleaf.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("api/v1")
public class DemoController {

	@GetMapping("/hello")
	public String getMessage(Model theModel) {
		theModel.addAttribute("theDate", new Date());
		
		return "datepage";
	}
}
