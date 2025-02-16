package com.example.Hostel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String fatherName;
	private Long mobilenNo;
	private String address;
	private String gender;
	private String purposeOfLiving;
	private String passcode;
	
	
	
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Long getMobilenNo() {
		return mobilenNo;
	}
	public void setMobilenNo(Long mobilenNo) {
		this.mobilenNo = mobilenNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPurposeOfLiving() {
		return purposeOfLiving;
	}
	public void setPurposeOfLiving(String purposeOfLiving) {
		this.purposeOfLiving = purposeOfLiving;
	}
	
	
}
