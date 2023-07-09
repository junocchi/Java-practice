package com.ju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ju.model.service.GreetService;

@Controller
public class GreetController {

	@Autowired
	private GreetService greetService;
	
	@RequestMapping
	
}
