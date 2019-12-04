package com.mandy.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandy.rest.service.TestService;

@RestController
@RequestMapping("/testinfo")
public class TestController {
	@Autowired
	TestService testService;

	@GetMapping
	public String hello() {
		return testService.getInfo();
	}
}
