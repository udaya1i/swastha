package com.swastha.dto.mapper;

import com.entity.Patient;
import com.swastha.dto.response.PatientCreateResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PatientCreateResponseMapper {
    public static PatientCreateResponse toResponse(Patient patient) {
        PatientCreateResponse patientCreateResponse = new PatientCreateResponse();
        patientCreateResponse.setAge(patient.getAge());
        patientCreateResponse.setGender(patient.getGender());
        patientCreateResponse.setFirstName(patient.getFirstName());
        patientCreateResponse.setLastName(patient.getLastName());
        patientCreateResponse.setMiddleName(patient.getMiddleName());
        patientCreateResponse.setUsername(patient.getUsername());
        patientCreateResponse.setEmail(patient.getEmail());
        patientCreateResponse.setMobileNumber(patient.getMobileNumber());
        return patientCreateResponse;
    }
}
