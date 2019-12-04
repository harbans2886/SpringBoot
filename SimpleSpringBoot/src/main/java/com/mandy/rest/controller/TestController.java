package com.mandy.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandy.rest.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	TestService testService;

	@GetMapping("/v1/info")
	public String v1Info() {
		System.out.println("/v1/info called ....");
		return testService.getInfo_v1();
	}
	
	
	/*@GetMapping("/v2/info")
	public String v2Info() {
		System.out.println("/v2/info called ....");
		return testService.getInfo_v2();
	}*/
}
