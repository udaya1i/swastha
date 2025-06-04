package com.swastha.service;

import com.entity.Patient;
import com.repo.patient.PatientRepository;
 import lombok.AllArgsConstructor;
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

    public Optional<Patient> findByUsername(String username){
        return this.patientRepository.findByUsername(username);
    }


}
