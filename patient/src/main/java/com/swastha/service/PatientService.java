package com.swastha.service;

import com.entity.Patient;
import com.repo.patient.PatientRepository;
import com.swastha.dto.payload.PatientCreatePayload;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author udaya
 */

@Service
@AllArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient createPatient(PatientCreatePayload patientCreatePayload) {
        Patient patient = new Patient();
        patient.setFirstName(patientCreatePayload.getFirstName());
        patient.setLastName(patientCreatePayload.getLastName());
        patient.setGender(patientCreatePayload.getGender());
        patient.setEmail(patientCreatePayload.getEmail());
        patient.setMobileNumber(patientCreatePayload.getMobileNumber());
        patient.setMiddleName(patientCreatePayload.getMiddleName());
        patient.setAddress(patientCreatePayload.getAddress());
        patient.setAge(patientCreatePayload.getAge());
        patient.setStatus(patientCreatePayload.getStatus());
        patient.setPassword(patientCreatePayload.getPassword());
        patient.setStatus("CREATED");
        patient.setUsername(patientCreatePayload.getUsername());
        return patientRepository.save(patient);
    }
}
