package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author udaya
 */
@Entity
@Setter
@Getter
@Table(name = "PATIENT")
public class Patient extends BaseEntity {


    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

}
