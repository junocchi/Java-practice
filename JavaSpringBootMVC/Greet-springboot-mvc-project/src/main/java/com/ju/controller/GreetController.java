package com.ju.controller;

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
	
}
