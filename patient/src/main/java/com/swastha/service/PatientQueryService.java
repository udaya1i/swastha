package com.swastha.service;

import com.entity.Patient;
import com.swastha.repo.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PatientQueryService {

    private final PatientRepository patientRepository;

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public Optional<Patient> findByUsername(String username, String mobileNumber){
        return this.patientRepository.findByUsernameAndMobileNumber(username, mobileNumber);
    }


}
