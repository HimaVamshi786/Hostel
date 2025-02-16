package com.example.Hostel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hostel.entity.Name;
import com.example.Hostel.repositary.NameRepositary;

@Service
public class NameService {

	@Autowired
	private NameRepositary repo;

	public List<Name> getAList() {
		List<Name> names = repo.findAll();
		return names;

	}

	public Object getByObject(int a) {
		return repo.findById(a);
	}
	
	public void removeByID(int a){ 
		repo.deleteById(a);
	}
}
