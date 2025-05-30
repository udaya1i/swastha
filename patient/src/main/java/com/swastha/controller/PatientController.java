package com.swastha.controller;

import com.constants.ApiConstant;
import com.dto.rawRequest.ServerResponse;
import com.swastha.dto.rawRequest.PatientCreateRequest;
import com.swastha.facade.PatientFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiConstant.PATIENT)
public class PatientController {

    private final PatientFacade patientFacade;

    public PatientController(PatientFacade patientFacade) {
        this.patientFacade = patientFacade;
    }

    @GetMapping
    public ResponseEntity<ServerResponse> getALl(){
        ServerResponse response = patientFacade.getAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(ApiConstant.CREATE)
    public ResponseEntity<ServerResponse> create(@RequestBody PatientCreateRequest patientCreateRequest) {
        ServerResponse serverResponse = patientFacade.create(patientCreateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(serverResponse);
    }



}
