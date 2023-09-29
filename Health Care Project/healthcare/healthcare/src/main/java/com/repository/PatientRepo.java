package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.entity.Patient;



public interface PatientRepo extends CrudRepository<Patient,Long>{
	
	@Override
	default Optional<Patient> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	@Query("Select * from patient where fname=? and lname = ? and email= ? and dob = ?")
	List<Patient> findByFnameAndLnameAndEmailAndDob(String fname, String lname,String email,String dob);
}
