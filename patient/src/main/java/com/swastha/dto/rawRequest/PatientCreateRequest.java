package com.swastha.dto.rawRequest;

import com.dto.rawRequest.RawRequest;
import lombok.Data;

@Data
public class PatientCreateRequest implements RawRequest {

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String mobileNumber;
    private String username;
    private String password;
    private Integer age;
    private String gender;
}
