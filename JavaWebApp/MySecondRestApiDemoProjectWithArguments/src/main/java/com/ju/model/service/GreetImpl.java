package com.ju.model.service;

import org.springframework.stereotype.Service;

@Service
public class GreetImpl implements Greet {

	@Override
	public String wish(String name) {
		return "Welcome " + name + " to the Rest API created by DI004!!!";
	}

}