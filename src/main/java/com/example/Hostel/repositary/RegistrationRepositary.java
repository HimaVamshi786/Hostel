package com.example.Hostel.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Hostel.entity.Registration;

public interface RegistrationRepositary extends JpaRepository<Registration,Integer> {
	
	Object findByNameAndPasscode(String name ,String passcode);
	
	@Query(value="select * from registration where name=?1 and mobilen_no=?2" , nativeQuery = true)
	Registration findforgetpasswaord(String name,Long mobile);

}
