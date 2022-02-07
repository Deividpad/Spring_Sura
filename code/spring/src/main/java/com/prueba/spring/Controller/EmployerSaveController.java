package com.prueba.spring.Controller;

import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employer")
public class EmployerSaveController {

    @Autowired
    IEmployerSave iEmployerSave;

    @PostMapping()
    public ResponseEntity<?> saveEmployer(@RequestBody Employer employer){
        return iEmployerSave.saveEmployer(employer);
    }
}
