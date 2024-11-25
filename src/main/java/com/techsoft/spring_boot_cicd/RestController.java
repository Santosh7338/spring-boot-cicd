package com.techsoft.spring_boot_cicd;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/welcome")
	public String test() {
		
		return "welcome to docker cicd version-3";
	}

}
