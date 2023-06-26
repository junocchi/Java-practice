package com.ju.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ju.model.service.Greet;

@RestController
public class GreetResource {

	@Autowired
	private Greet greet;
	
	@GetMapping(path = "/greet/{name}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String wishResource(@PathVariable("name") String name) {
		return greet.wish(name);
	}
}