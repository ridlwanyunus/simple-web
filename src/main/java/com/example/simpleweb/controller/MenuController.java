package com.example.simpleweb.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

	
	
	@GetMapping("/")
	public ModelAndView index() {
		String hostAddress = "";
		String hostName = "";
		
		try {
			hostAddress = InetAddress.getLocalHost().getHostAddress();
			hostName = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("message1",hostAddress);
		model.addObject("message2",hostName);
		return model;
	}
	
}
