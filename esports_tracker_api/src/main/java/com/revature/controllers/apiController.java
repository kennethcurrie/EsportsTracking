package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="test")
public class apiController {
	@GetMapping("test")
	public String test( ) {
		return "hello world!";
	}
}
