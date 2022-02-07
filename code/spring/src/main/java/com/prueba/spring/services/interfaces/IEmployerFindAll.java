package com.prueba.spring.services.interfaces;

import com.prueba.spring.models.Employer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEmployerFindAll {
    ResponseEntity<?> findAllEmployer();
}
