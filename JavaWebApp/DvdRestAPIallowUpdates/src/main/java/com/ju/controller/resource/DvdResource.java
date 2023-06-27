package com.ju.controller.resource;

import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ju.dto.entity.Dvd;
import com.ju.dto.entity.DvdList;
import com.ju.model.service.DvdService;

@RestController
public class DvdResource {

	@Autowired
	DvdService dvdService;

	// GET all dvds
	@CrossOrigin
	@GetMapping(path = "/dvds/{dvdID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dvd> searchDvdByIdResource(@PathVariable("dvdId") int id) {
		Dvd dvd = dvdService.searchDvdById(id);
		ResponseEntity response = null;
		if (dvd != null)
			response = new ResponseEntity<Dvd>(dvd, HttpStatus.FOUND);
		else
			response = new ResponseEntity<Dvd>(dvd, HttpStatus.NOT_FOUND);
		return response;
	}

	// GET dvd by ID
	@CrossOrigin
	@GetMapping(path = "/dvds", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DvdList> getAllDvds() {
		DvdList dvdList = new DvdList(dvdService.getAllDvds());
		if (dvdList.getDvds().size() > 0)
			return new ResponseEntity<DvdList>(dvdList, HttpStatus.OK);
		else
			return new ResponseEntity<DvdList>(dvdList, HttpStatus.NO_CONTENT);
	}

	// POST (add a dvd)
	@PostMapping(path = "/dvds", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dvd> insertDvdResource(@RequestBody Dvd dvd) {
		if (dvdService.insertDvd(dvd))
			return new ResponseEntity<Dvd>(dvd, HttpStatus.CREATED);
		else
			return new ResponseEntity<Dvd>(HttpStatus.NOT_ACCEPTABLE);
	}

	// DELETE a dvd
	@DeleteMapping(path = "/dvds/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dvd> deleteDvdResource(@PathVariable int id) {
		Dvd dvd = dvdService.deleteDvd(id);
		if (dvd != null)
			return new ResponseEntity<Dvd>(dvd, HttpStatus.OK);
		else
			return new ResponseEntity<Dvd>(HttpStatus.NO_CONTENT);
	}

	// PUT (modify the User Rating)
	@PutMapping(path = "/dvds/{id}/{userRating}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dvd> updateDvdUserRating(@PathVariable("id") int id, @PathVariable("userRating") int userRating) {

		Dvd dvd = dvdService.updateDvdUserRating(id, userRating);
		if (dvd != null)
			return new ResponseEntity<Dvd>(dvd, HttpStatus.OK);
		else
			return new ResponseEntity<Dvd>(HttpStatus.BAD_REQUEST);

	}
}
