package com.sampleproject.samplespringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	
	@GetMapping("/get-det")
	public String getName() {
		return "Hello Dhana";
	}

}
