package com.prueba.spring.services;

import com.prueba.spring.Repository.EmployerRepository;
import com.prueba.spring.dto.ResponseDTO;
import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerFindAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployerFindAllService implements IEmployerFindAll {

    @Autowired
    EmployerRepository employerRepository;

    ResponseDTO responseDTO;
    EmployerFindAllService(){
        responseDTO = new ResponseDTO();
    }

    @Override
    public ResponseEntity<?> findAllEmployer() {
        List<Employer> employerFindAll = employerRepository.findAll();
        if (employerFindAll.size() > 0){
            return ResponseEntity.ok().body(employerFindAll);
        }else {
            responseDTO.setMessage("No hay empleados por listar");
            responseDTO.setSuccess(true);
            responseDTO.setStatus(200);
            return ResponseEntity.ok().body(responseDTO);
        }
    }
}
