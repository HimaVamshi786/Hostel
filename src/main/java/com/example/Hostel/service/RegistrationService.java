package com.example.Hostel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hostel.entity.Registration;
import com.example.Hostel.repositary.RegistrationRepositary;

@Service
public class RegistrationService {


	@Autowired
	private RegistrationRepositary repo;
	
	public String save(Registration reg) {
		int k=(int) (Math. floor(900000*Math. random())+100000);
		reg.setPasscode(Integer.toString(k));
		repo.save(reg);
		return "Profile Created";
	}
}
