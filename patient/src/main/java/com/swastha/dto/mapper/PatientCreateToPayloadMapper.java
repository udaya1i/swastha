package com.swastha.dto.mapper;

import com.swastha.dto.payload.PatientCreatePayload;
import com.swastha.dto.rawRequest.PatientCreateRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PatientCreateToPayloadMapper {
    public static PatientCreatePayload mapToPayload(PatientCreateRequest patient) {
        PatientCreatePayload payload = new PatientCreatePayload();
        payload.setFirstName(patient.getFirstName());
        payload.setLastName(patient.getLastName());
        payload.setGender(patient.getGender());
        payload.setPassword(patient.getPassword());
        payload.setEmail(patient.getEmail());
        payload.setAge(patient.getAge());
        payload.setStatus("CREATED");
        payload.setMobileNumber(payload.getMobileNumber());
        payload.setMiddleName(patient.getMiddleName());
        payload.setUsername(patient.getUsername());
        return payload;
    }
}
