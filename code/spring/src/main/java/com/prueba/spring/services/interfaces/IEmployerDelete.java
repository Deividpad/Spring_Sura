package com.prueba.spring.services.interfaces;

import org.springframework.http.ResponseEntity;

public interface IEmployerDelete {
    ResponseEntity<?> deleteEmployer(long employerId);
}
