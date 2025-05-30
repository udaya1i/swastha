package com.swastha.facade;

import com.dto.rawRequest.ServerResponse;
import com.entity.Patient;
import com.swastha.dto.mapper.PatientCreateResponseMapper;
import com.swastha.dto.payload.PatientCreatePayload;
import com.swastha.dto.rawRequest.PatientCreateRequest;
import com.swastha.dto.rawRequest.requestValidator.PatientCreateRequestValidator;
import com.swastha.service.PatientQueryService;
import com.swastha.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PatientFacade {

    private final PatientService patientService;
    private final PatientCreateRequestValidator patientCreateRequestValidator;
    public final PatientQueryService patientQueryService;


    public PatientFacade(PatientService patientService, PatientCreateRequestValidator patientCreateRequestValidator, PatientQueryService patientQueryService) {
        this.patientService = patientService;
        this.patientCreateRequestValidator = patientCreateRequestValidator;
        this.patientQueryService = patientQueryService;
    }

    public ServerResponse getAll() {
        return ServerResponse.builder()
                .setMessage("Patents fetched successfully")
                .setStatus(HttpStatus.OK)
                .setData(patientQueryService.findAll())
                .build();
    }

    public ServerResponse create(PatientCreateRequest patientCreateRequest) {
        PatientCreatePayload payload = patientCreateRequestValidator.validate(patientCreateRequest);
        Patient patient = patientService.createPatient(payload);
        return ServerResponse.builder()
                .setMessage("Patient Created Successfully.")
                .setData(PatientCreateResponseMapper.toResponse(patient))
                .setStatus(HttpStatus.CREATED)
                .build();

    }
}
