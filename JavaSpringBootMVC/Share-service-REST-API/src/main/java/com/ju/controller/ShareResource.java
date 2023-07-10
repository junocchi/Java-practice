package com.ju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ju.dto.entity.Share;
import com.ju.dto.entity.ShareList;
import com.ju.model.service.ShareService;

@RestController
public class ShareResource {

	@Autowired
	private ShareService shareService;

	@CrossOrigin
	@GetMapping(path = "/Shares", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ShareList> getAllShares() {
		ShareList shareList = new ShareList(shareService.getAllShares());
		if (shareList.getShares().size() > 0)
			return new ResponseEntity<ShareList>(shareList, HttpStatus.OK);
		else
			return new ResponseEntity<ShareList>(shareList, HttpStatus.NO_CONTENT);
	}

	@CrossOrigin
	@GetMapping(path = "/Shares/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Share getShareByIdResource(@PathVariable("id") int shareId) {
		return shareService.searchShareNameById(shareId);
	}
}

//Output:
//http://localhost:9002/Shares
//{"shares":[{"shareId":1,"shareName":"Apple","marketPrice":150.75},
//           {"shareId":2,"shareName":"Microsoft","marketPrice":300.5},
//           {"shareId":3,"shareName":"Amazon","marketPrice":3500.25},
//           {"shareId":4,"shareName":"Google","marketPrice":2500.8},
//           {"shareId":5,"shareName":"Facebook","marketPrice":350.5},
//           {"shareId":6,"shareName":"Tesla","marketPrice":750.1},
//           {"shareId":7,"shareName":"Netflix","marketPrice":550.75},
//           {"shareId":8,"shareName":"Alphabet","marketPrice":2750.6}]}

//http://localhost:9002/Shares/6
//{"shareId":6,"shareName":"Tesla","marketPrice":750.1}