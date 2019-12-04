package com.mandy.rest.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public TestService() {
		System.out.println("Test Service has been initialized...");
	}

	public String getInfo() {
		return "Return Info Stack";
	}
}
