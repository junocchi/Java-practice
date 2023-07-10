package com.ju.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ju.dto.entity.Dvd;
import com.ju.model.service.DvdService;

@Controller
public class DvdController {

	@Autowired
	private DvdService dvdService;
	
	@RequestMapping("/")
	public ModelAndView welcomePageController() {
		return new ModelAndView("Index");
	}
	
	@RequestMapping("/inputDvdIdPage")
	public ModelAndView InputDvdIdPageController() {
		return new ModelAndView("InputDvdId");
	}
	
	@RequestMapping("/searchDvdById")
	public ModelAndView searchDvdByIdController(@RequestParam("empId") int dvdId) {
		ModelAndView modelAndView = new ModelAndView();
		Dvd dvd = dvdService.getDvdById(dvdId);
		
		if(dvd != null) {
			modelAndView.addObject("dvd", dvd);
			modelAndView.setViewName("ShowDvd");
		}
		else {
			modelAndView.addObject("message", "Dvd with ID " + dvdId + " does not exist");
			modelAndView.setViewName("Output");
		}
		return modelAndView;
	}
}
