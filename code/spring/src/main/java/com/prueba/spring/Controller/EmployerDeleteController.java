package com.prueba.spring.Controller;

import com.prueba.spring.services.interfaces.IEmployerDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employer")
public class EmployerDeleteController {

    @Autowired
    IEmployerDelete iEmployerDelete;

    @DeleteMapping("/{employerId}")
    public ResponseEntity<?> deleteEmployer (@PathVariable Long employerId){
        return iEmployerDelete.deleteEmployer(employerId);
    }
}
