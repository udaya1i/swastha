package com.swastha.dto.response;

import lombok.Data;

@Data
public class PatientCreateResponse {
    private String firstName;
    private String lastName;
    private String middleName;
    private String username;
    private String mobileNumber;
    private String email;
    private String gender;
    private Integer age;

}
