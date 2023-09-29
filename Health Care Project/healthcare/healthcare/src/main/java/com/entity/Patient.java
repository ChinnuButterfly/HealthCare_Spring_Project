package com.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


  /* Author : Bhargav Mandadi 
   * Contact Number : 6301792283 
   * Email : mandadi448@gmail.com
   */



@Entity
public class Patient {
	
	
	// variable declaration for the patient
	
	@Id
	@Column(columnDefinition = "NOT NULL",nullable = false,updatable = false,unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long healthID;
	
	private String fname;
	private String mname;
	private String lname;
	private long contactNumber;
	private String email;
	private String gender;
	private String UID;
	private String diseaseDescription;
	private String dob;
	
	
	// Constructor creation for the class 
	
	public Patient(long healthID,String fname,String mname,String lname,long contactNumber,
			String email,String gender,String UID,String diseaseDescription,String dob)
	{
		super();
		this.healthID = healthID;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.contactNumber = contactNumber;
		this.email = email;
		this.gender = gender;
		this.UID = UID;
		this.diseaseDescription = diseaseDescription;
		this.dob = dob;
		
	}

	// getters & setters to access the private variable on outside of the class.
	
	public long getHealthID() {
		return healthID;
	}


	public void setHealthID(long healthID) {
		this.healthID = healthID;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getUID() {
		return UID;
	}


	public void setUID(String uID) {
		UID = uID;
	}


	public String getDiseaseDescription() {
		return diseaseDescription;
	}


	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}

	  
	
	// to string method .
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "HealthCare [healthID=" + healthID + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname
				+ ", contactNumber=" + contactNumber + ", dob=" +dob+", email=" + email + ", gender=" + gender + ", UID=" + UID
				+ ", diseaseDescription=" + diseaseDescription + "]";
	}
	
	
	
	
	
	
	
	
}
