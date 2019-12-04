package com.mandy.rest.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public TestService() {
		System.out.println("Test Service has been initialized...");
	}

	public String getInfo_v1() {
		return "Return Info Stack v1";
	}
	
	/*public String getInfo_v2() {
		return "Return Info Stack v2";
	}*/
}
