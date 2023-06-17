package com.ashokit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {
	@GetMapping
	public ResponseEntity<String> wishMe(){
		return new ResponseEntity<String>("Hi Folks", HttpStatus.OK);
	}
}
