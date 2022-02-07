package com.prueba.spring.Controller;

import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerFindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employer")
public class EmployerFindByController {

    @Autowired
    IEmployerFindBy iEmployerFindBy;

    @GetMapping("/{employerId}")
    public ResponseEntity<?> findEmployerById(@PathVariable Long employerId) {
        return iEmployerFindBy.findEmployerById(employerId);
    }

    @GetMapping("/dni/{employerDni}")
    public ResponseEntity<?> findEmployerByDni(@PathVariable int employerDni) {
        return iEmployerFindBy.findEmployerByDni(employerDni);
    }
}
