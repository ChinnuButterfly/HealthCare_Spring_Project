package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import com.entity.Patient;
import com.service.PatientService;


@CrossOrigin(value="*")
@RestController
@RequestMapping("/api")
public class PatientController {
	
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping( value = "/patient", consumes = "application/json", produces = "application/json")
	public Patient saveTrain(@RequestPayload Patient patient) {
		
		try {
		 return patientService.savePatientDetails1(patient);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patient;

	}

	@PutMapping( value = "/patient", consumes = "application/json", produces = "application/json")
	public Patient updateTrain(@RequestPayload Patient patient) {
		
		try {
		 return patientService.updatePatientDetails(patient);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patient;

	}
	
	@DeleteMapping(value="/patient/delete/{healthId}", consumes = "application/json", produces = "application/json")
	public void deletePatient(@PathVariable long healthID) {
		patientService.deletePatient(healthID);

	}
	
	@GetMapping(value="/patient/{healthId}", consumes = "application/json", produces = "application/json")
	public Optional<Patient> getPatientById(@PathVariable long healthID) {
		try {
			return patientService.getPatient(healthID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(value="/patient/searchPatience" , consumes = "application/json", produces = "application/json")
	public List<Patient> SearchPatiens(@PathVariable String fname,@PathVariable String lname,@PathVariable String email,@PathVariable String dob) {
		return patientService.findByFnameAndLnameAndEmailAndDob(fname, lname, email, dob);
	}
	
	@GetMapping(value="/patient/getAllPatients",consumes = "application/json", produces = "application/json")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	
	

}
