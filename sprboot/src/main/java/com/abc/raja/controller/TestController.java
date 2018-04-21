package com.abc.raja.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/login")
	public String index() {
		return "Greetings from Boot!";
	}

}
