package com.swastha.dto.rawRequest.requestValidator;

import com.dto.rawRequest.rawRequestValidator.RawRequestValidator;
import com.entity.Patient;
import com.swastha.dto.mapper.PatientCreateToPayloadMapper;
import com.swastha.dto.payload.PatientCreatePayload;
import com.swastha.dto.rawRequest.PatientCreateRequest;
import com.swastha.service.PatientQueryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author udaya
 */

@Service
@AllArgsConstructor
public class PatientCreateRequestValidator implements
        RawRequestValidator<PatientCreateRequest, PatientCreatePayload> {

    private final PatientQueryService patientQueryService;


    @Override
    public PatientCreatePayload validate(PatientCreateRequest request) {
        Optional<Patient> byUsername = patientQueryService.findByUsername(request.getUsername());
        if (byUsername.isPresent()) {
            throw new RuntimeException("Patient with username " + request.getUsername() + " not found");
        }

        return PatientCreateToPayloadMapper.mapToPayload(request);
    }


}
