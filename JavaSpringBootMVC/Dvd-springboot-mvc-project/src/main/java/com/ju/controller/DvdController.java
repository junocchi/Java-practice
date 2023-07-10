package com.ju.controller;

import java.util.List;

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

	@RequestMapping("/InputDvdId")
	public ModelAndView inputDvdIdPageController() {
		return new ModelAndView("InputDvdId");
	}

	@RequestMapping("/SearchDvdById")
	public ModelAndView searchDvdByIdController(@RequestParam("dvdId") int dvdId) {
		ModelAndView modelAndView = new ModelAndView();
		Dvd dvd = dvdService.getDvdById(dvdId);

		if (dvd != null) {
			modelAndView.addObject("dvd", dvd);
			modelAndView.setViewName("ShowDvd");
		} else {
			modelAndView.addObject("message", "Dvd with ID " + dvdId + " does not exist");
			modelAndView.setViewName("Output");
		}
		return modelAndView;
	}
	
//	@RequestMapping("/SearchDvdByTitle")
//	public ModelAndView searchDvdByTitleController(@RequestParam("title") String title) {
//		ModelAndView modelAndView = new ModelAndView();
//		Dvd dvd = dvdService.getDvdByTitle(title);
//
//		if (dvd != null) {
//			modelAndView.addObject("dvd", dvd);
//			modelAndView.setViewName("ShowDvd");
//		} else {
//			modelAndView.addObject("message", "Dvd with ID " + title + " does not exist");
//			modelAndView.setViewName("Output");
//		}
//		return modelAndView;
//	}

	@RequestMapping("/InputDvdDetails")
	public ModelAndView InputDvdDetailsPageController() {
		return new ModelAndView("InputDvdDetails");
	}

	@RequestMapping("/ShowAllDvds")
	public ModelAndView showAllDvdsController() {
		ModelAndView modelAndView = new ModelAndView();

		List<Dvd> dvdList = dvdService.getAllDvds();
		modelAndView.addObject("dvdList", dvdList);
		modelAndView.setViewName("ShowAllDvds");
		return modelAndView;
	}

	@RequestMapping("/SaveDvd")
	public ModelAndView saveDvdController(@RequestParam("dvdId") int dvdId, @RequestParam("title") String title,
			@RequestParam("mpaaRating") int mpaaRating, @RequestParam("directorName") String directorName,
			@RequestParam("studio") String studio, @RequestParam("userRating") int userRating) {
		ModelAndView modelAndView = new ModelAndView();

		Dvd dvd = new Dvd(dvdId, title, mpaaRating, directorName, studio, userRating);

		String message = null;
		if (dvdService.addDvd(dvd))
			message = "Dvd Added";
		else
			message = "Dvd Not Added";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");

		return modelAndView;
	}
	
	@RequestMapping("/InputDvdIDPageForDelete")
	public ModelAndView inputDvdIdPageForDeleteController() {
		return new ModelAndView("InputDvdIdForDelete");
	}

	@RequestMapping("/DeleteDvd")
	public ModelAndView deleteDvdController(@RequestParam("dvdId") int dvdId) {
		ModelAndView modelAndView = new ModelAndView();
		String message = null;
		if (dvdService.deleteDvdById(dvdId)) {
			message = "Dvd with id " + dvdId + " deleted !";
		} else {
			message = "Dvd with id " + dvdId + " not deleted !";
		}
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	
	@RequestMapping("/InputDvdDetailsPageForUpdate")
	public ModelAndView InputDvdDetailsPageForUpdateController(){
		return new ModelAndView("InputDvdDetailsForUpdate");
	}
	
	
	@RequestMapping("/UpdateDvdUserRating")
	public ModelAndView updateDvdSalaryController(@RequestParam("dvdId") int dvdId,@RequestParam("updatedUserRating") int updatedUserRating) {
		
		String message=null;
		
		if(dvdService.updateDvdUserRating(dvdId, updatedUserRating))
			message="User Rating for Dvd ID " + dvdId;
		else
			message="User Rating was updated for Dvdloyee ID "+dvdId;
		
		return new ModelAndView("Output", "message", message);
	}
	
}
