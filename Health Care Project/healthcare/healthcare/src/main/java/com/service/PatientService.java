package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Patient;
import com.repository.PatientRepo;

@Service
public class PatientService {

	@Autowired
	private static PatientRepo patientrepo;

	public Patient savePatientDetails1(Patient patient) {

		return patientrepo.save(patient);
	}

	public Patient updatePatientDetails(Patient patient) {

		return patientrepo.save(patient);
	}

	public void deletePatient(Long healthID) {

		patientrepo.deleteById(healthID);
	}

	public Optional<Patient> getPatient(Long healthID) {

		return patientrepo.findById(healthID);
	}

	public List<Patient> getAllPatients() {

		return (List<Patient>) patientrepo.findAll();
	}

	public List<Patient> findByFnameAndLnameAndEmailAndDob(String fname, String lname,String email,String dob) {
		return patientrepo.findByFnameAndLnameAndEmailAndDob(fname, lname, email, dob);
	}
	
}
