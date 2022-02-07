package com.prueba.spring.services.interfaces;

import com.prueba.spring.models.Employer;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IEmployerFindBy {
    Optional<Employer> findOptionalEmployerById(long employerId);
    ResponseEntity<?> findEmployerById(long employerId);
    ResponseEntity<?> findEmployerByDni(int employerId);
}
