package com.prueba.spring.services;

import com.prueba.spring.Repository.EmployerRepository;
import com.prueba.spring.dto.ResponseDTO;
import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerFindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployerFindByService implements IEmployerFindBy {

    @Autowired
    EmployerRepository employerRepository;

    ResponseDTO responseDTO;
    EmployerFindByService(){
        responseDTO = new ResponseDTO();
    }

    @Override
    public Optional<Employer> findOptionalEmployerById(long employerId) {
        return employerRepository.findById(employerId);
    }

    @Override
    public ResponseEntity<?> findEmployerById(long employerId) {
        Optional<Employer> employerFind = findOptionalEmployerById(employerId);
        if (employerFind.isPresent()){
            return ResponseEntity.ok().body(employerFind.get());
        }else{
            responseDTO.setMessage("El empleado con id " + employerId + " no existe.");
            responseDTO.setSuccess(true);
            responseDTO.setStatus(200);
            return ResponseEntity.ok().body(responseDTO);
        }
    }

    @Override
    public ResponseEntity<?> findEmployerByDni(int employerDni) {
        List<Employer> listEmployerFindByDni = employerRepository.findByDni(employerDni);
        if (listEmployerFindByDni.size() > 0){
            return ResponseEntity.ok().body(listEmployerFindByDni);
        }else{
            responseDTO.setMessage("No se encontró nigún empleado con el DNI " + employerDni + ".");
            responseDTO.setSuccess(true);
            responseDTO.setStatus(200);
            return ResponseEntity.ok().body(responseDTO);
        }
    }
}
