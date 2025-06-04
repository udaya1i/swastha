package com.service;

import com.entity.Patient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.repo.patient.PatientRepository;
import org.springframework.stereotype.Service;

@Service

public class UserService implements UserDetailsService {

    @Autowired
    public PatientRepository patientService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Patient patient = patientService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with username " + username + " not found"));

        return new UserPrincipal(patient);
    }
}
