package com.prueba.spring.Controller;

import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employer")
public class EmployerUpdateController {

    @Autowired
    IEmployerUpdate iEmployerUpdate;

    @PutMapping("/{employerId}")
    public ResponseEntity<?> updateEmployer(@PathVariable Long employerId, @RequestBody Employer employer){
        employer.setId(employerId);
        return iEmployerUpdate.updateEmployer(employer);
    }
}
