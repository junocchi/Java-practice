package com.ju.controller.resource;

import org.springframework.http.MediaType;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ju.dto.entity.Dvd;
import com.ju.dto.entity.DvdList;
import com.ju.model.service.DvdService;

@RestController
public class DvdResource {
	
	@Autowired
	DvdService dvdService;

	@GetMapping(path = "/dvds/{dvdId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dvd> searchDvdByIdResource(@PathVariable("dvdId") int id) {
		Dvd dvd=dvdService.searchDvdById(id);
		ResponseEntity response=null;
		if(dvd!=null)
			response=new ResponseEntity<Dvd>(dvd, HttpStatus.FOUND);
		else
			response=new ResponseEntity<Dvd>(dvd,HttpStatus.NOT_FOUND);
		return response;
	}
	
	@GetMapping(path="/dvds",produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<DvdList> getAllDvds() {
		DvdList dvdList= new DvdList(dvdService.getAllDvds());
		if(dvdList.getDvds().size()>0)
			return new ResponseEntity<DvdList>(dvdList,HttpStatus.OK);
		else
			return new ResponseEntity<DvdList>(dvdList,HttpStatus.NO_CONTENT);
	}
}
