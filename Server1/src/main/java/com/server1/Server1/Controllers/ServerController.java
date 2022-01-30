package com.server1.Server1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	
	@GetMapping("/getUrlPort")
	public String getUrlPort() {
		return "Response from PORT - 9001";
	}
}
