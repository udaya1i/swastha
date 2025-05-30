package com.swastha.repo;

import com.entity.Patient;
import com.repo.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends AbstractRepository<Patient, Integer> {

     Optional<Patient> findByUsernameAndMobileNumber(String username, String mobileNumber);
}
