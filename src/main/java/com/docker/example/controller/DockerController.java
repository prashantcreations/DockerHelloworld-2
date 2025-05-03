package com.docker.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/getData")
	public String getData() {
		return "I got data heee";
	}

}
