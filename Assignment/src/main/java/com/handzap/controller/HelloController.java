package com.handzap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.handzap.config.APIName;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = APIName.CHARSET)
	public String hello() {
		return "Hello";
	}

}
