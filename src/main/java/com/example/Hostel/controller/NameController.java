package com.example.Hostel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Hostel.entity.Name;
import com.example.Hostel.entity.Registration;
import com.example.Hostel.repositary.RegistrationRepositary;
import com.example.Hostel.service.NameService;

@RestController
public class NameController {

	@Autowired
	private NameService service;

	@Autowired
	RegistrationRepositary repo;

	@GetMapping("/NaaLovedaLoJava")
	public List<Name> getAll() {
		return service.getAList();
	}

	@GetMapping("/NaaDawaloProgram")
	public Object getbyid(@RequestParam int a) {
		return service.getByObject(a);
	}

	@GetMapping("/NaaDawaloProgram.")
	public String getbyid(@RequestParam String name, @RequestParam String password) {
		Object si = repo.findByNameAndPasscode(name, password);
		if (si != null) {
			return "welcome to lanjala kompa";
		}
		return "tikka pukka lonjakodaka dengithae devvuda antav lae";
	}

	@PostMapping("/forgot")
	public ResponseEntity<String> forgot(@RequestParam String name, @RequestParam String mobilenNo,
			@RequestParam String newpassword) {
		Registration si = repo.findforgetpasswaord(name, Long.parseLong(mobilenNo));
		si.setPasscode(newpassword);
		repo.save(si);
		return new ResponseEntity<String>("sucess", HttpStatus.OK);
	}
}