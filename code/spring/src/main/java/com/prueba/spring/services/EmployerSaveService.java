package com.prueba.spring.services;

import com.prueba.spring.Repository.EmployerRepository;
import com.prueba.spring.dto.ResponseDTO;
import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployerSaveService implements IEmployerSave {

    @Autowired
    EmployerRepository employerRepository;

    ResponseDTO responseDTO;
    EmployerSaveService(){
        responseDTO = new ResponseDTO();
    }

    @Override
    public ResponseEntity<?> saveEmployer(Employer employer) {
        try {
            employerRepository.save(employer);
            responseDTO.setMessage("Empleado guardado correctamente");
            responseDTO.setSuccess(true);
            responseDTO.setStatus(200);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        }catch (Exception e){
            responseDTO.setMessage("Error al guardar el empleado. \n" + e.getMessage());
            responseDTO.setSuccess(false);
            responseDTO.setStatus(500);
            return new ResponseEntity<>(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
