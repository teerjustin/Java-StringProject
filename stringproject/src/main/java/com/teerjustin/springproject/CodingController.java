package com.teerjustin.springproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String hello() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String helloPython() {
		return "Python was awesome!";
	}
	@RequestMapping("/java")
	public String helloJava() {
		return "Java is better!";
	}
}
