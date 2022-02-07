package com.prueba.spring.Controller;

import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerFindAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/api/employer")
public class EmployerFindAllController {

    @Autowired
    IEmployerFindAll iEmployerFindAll;

    @GetMapping()
    public ResponseEntity<?> findAllEmployer(){
        return iEmployerFindAll.findAllEmployer();
    }
}
