package com.ju.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ju.model.service.GreetService;

@Controller
public class GreetController {

	@Autowired
	private GreetService greetService;

	@RequestMapping("/")
	public ModelAndView firstController() {
		ModelAndView modelAndView = new ModelAndView();

		String displayMessage = greetService.wish();

		modelAndView.addObject("message", displayMessage);
		modelAndView.setViewName("ShowMessage");

		return modelAndView;

	}

	@RequestMapping("/first")
	public ModelAndView secondController() {
		ModelAndView modelAndView = new ModelAndView();

		// LocalDate localDate = LocalDate.now();

		// String message = "Welcome to DI004 Batch Web App at " + localDate;
		String message = "Welcome to DI004 Batch Web App at " + LocalDateTime.now();
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("ShowMessage");

		return modelAndView;
	}

}
