package com.siao.chen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class AppController {

	
	@RequestMapping("/hello")
	@ResponseBody
	String home() {
		return "Hello world!!";
	}
}
