package com.github.dormymo.ssmframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "hello")
	public String helloWorld(){
		return "index";
	}
	
}
