package com.example.simpleweb.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("log")
public class LogController {

	Logger log = LoggerFactory.getLogger(getClass());
	
	
	@GetMapping("/{any}")
	public Map<String, String> writeLog(@PathVariable(value = "any") String any){
		Map<String, String> response = new HashMap<String, String>();
		response.put("input", any);
		log.error(any);
		
		return response;
	}
	
	
}
