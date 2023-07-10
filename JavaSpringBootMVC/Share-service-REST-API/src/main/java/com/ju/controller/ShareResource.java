package com.ju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ju.dto.entity.Share;
import com.ju.model.service.ShareService;

@RestController
public class ShareResource {

	@Autowired
	private ShareService shareService;
	
	@GetMapping(path = "/Shares/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Share getShareByIdResource(@PathVariable("id") int shareId) {
		return shareService.searchShareNameById(shareId);
	}
}
