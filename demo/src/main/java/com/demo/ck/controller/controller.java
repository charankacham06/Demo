package com.demo.ck.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class controller {
	@RequestMapping("/")
	public String hello() {
		return "Hey Charan";
	}

}
