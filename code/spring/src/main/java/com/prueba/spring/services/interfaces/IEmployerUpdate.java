package com.prueba.spring.services.interfaces;

import com.prueba.spring.models.Employer;
import org.springframework.http.ResponseEntity;

public interface IEmployerUpdate {
    ResponseEntity<?> updateEmployer (Employer employer);
}
