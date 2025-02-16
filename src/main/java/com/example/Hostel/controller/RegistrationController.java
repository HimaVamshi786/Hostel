package com.example.Hostel.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Hostel.entity.Registration;
import com.example.Hostel.service.RegistrationService;

@RestController
@CrossOrigin
public class RegistrationController {
	
	@Autowired
	RegistrationService service;

	@PostMapping("/create")
	public ResponseEntity<String> save(@RequestBody Registration reg) {
		char mobil=reg.getMobilenNo().toString().charAt(0);
		int g=reg.getMobilenNo().toString().length();
		char[] f=reg.getMobilenNo().toString().toCharArray();
		ArrayList<Character> list = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9','0'));
		if(!(g==10) && !(mobil==9 ||mobil==8 || mobil==7 || mobil==6) ) {
			for(char i:f) {
				if(!(list.contains(i))) {
					return new ResponseEntity<String>("provide a vaild mobile number",HttpStatus.BAD_REQUEST);
				}
			}
			
			return new ResponseEntity<String>("provide a vaild mobile number",HttpStatus.BAD_REQUEST);
		}
		 
	return new ResponseEntity<String>(service.save(reg),HttpStatus.OK);
	}
	

}
