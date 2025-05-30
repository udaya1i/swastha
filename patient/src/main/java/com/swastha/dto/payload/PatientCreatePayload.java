package com.swastha.dto.payload;

import com.dto.payload.Payload;
import lombok.Data;

@Data
public class PatientCreatePayload implements Payload {

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String mobileNumber;
    private Integer age;
    private String address;
    private String gender;
    private String status;
    private String username;
    private String password;

}
