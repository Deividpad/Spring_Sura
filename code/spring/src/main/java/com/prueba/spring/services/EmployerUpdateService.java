package com.prueba.spring.services;

import com.prueba.spring.Repository.EmployerRepository;
import com.prueba.spring.dto.ResponseDTO;
import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerFindBy;
import com.prueba.spring.services.interfaces.IEmployerUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployerUpdateService implements IEmployerUpdate {

    @Autowired
    EmployerRepository employerRepository;

    @Autowired
    IEmployerFindBy iEmployerFindBy;

    ResponseDTO responseDTO;
    EmployerUpdateService(){
        responseDTO = new ResponseDTO();
    }

    @Override
    public ResponseEntity<?> updateEmployer(Employer employer) {
        Optional<Employer> employerFind = iEmployerFindBy.findOptionalEmployerById(employer.getId());
        if(employerFind.isPresent()) {
            Employer employerUpdate = employerFind.get();
            employerUpdate.setNombre(employer.getNombre());
            employerUpdate.setDni(employer.getDni());
            employerUpdate.setCargo(employer.getCargo());
            employerUpdate.setFechaIngreso(employer.getFechaIngreso());
            try{
                employerRepository.save(employerUpdate);
                responseDTO.setMessage("Empleado actualizado correctamente con id " + employer.getId());
                responseDTO.setSuccess(true);
                responseDTO.setStatus(200);
                return new ResponseEntity<>(responseDTO, HttpStatus.OK);
            }catch (Exception e){
                responseDTO.setMessage("Ocurrio un error interno en el servidor \n" + e.getMessage());
                responseDTO.setSuccess(false);
                responseDTO.setStatus(500);
                return new ResponseEntity<>(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
            }


        }else{
            responseDTO.setMessage("Empleado con id " + employer.getId() + " no existe");
            responseDTO.setSuccess(false);
            responseDTO.setStatus(404);
            return new ResponseEntity<>(responseDTO, HttpStatus.NOT_FOUND);
        }
    }
}
