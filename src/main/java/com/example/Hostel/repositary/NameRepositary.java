package com.example.Hostel.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hostel.entity.Name;

public interface NameRepositary extends JpaRepository<Name,Integer> {
	
	
}
