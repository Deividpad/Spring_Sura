package com.prueba.spring.services;

import com.prueba.spring.Repository.EmployerRepository;
import com.prueba.spring.dto.ResponseDTO;
import com.prueba.spring.models.Employer;
import com.prueba.spring.services.interfaces.IEmployerDelete;
import com.prueba.spring.services.interfaces.IEmployerFindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployerDeleteService implements IEmployerDelete {

    @Autowired
    EmployerRepository employerRepository;

    @Autowired
    IEmployerFindBy iEmployerFindBy;

    ResponseDTO responseDTO;
    EmployerDeleteService(){
        responseDTO = new ResponseDTO();
    }

    @Override
    public ResponseEntity<?> deleteEmployer(long employerId) {

            Optional<Employer> employerFind = iEmployerFindBy.findOptionalEmployerById(employerId);
            if(employerFind.isPresent()){
                try{
                    employerRepository.delete(employerFind.get());
                    responseDTO.setMessage("Empleado con id " + employerId + " eliminado correctamente.");
                    responseDTO.setSuccess(true);
                    responseDTO.setStatus(200);
                    return new ResponseEntity<>(responseDTO, HttpStatus.OK);
                }catch (Exception e) {
                    responseDTO.setMessage("Error al eliminar el empleado. \n" + e.getMessage());
                    responseDTO.setSuccess(false);
                    responseDTO.setStatus(500);
                    return new ResponseEntity<>(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }else{
            responseDTO.setMessage("Empleado con id " + employerId + " no existe");
            responseDTO.setSuccess(true);
            responseDTO.setStatus(404);
            return new ResponseEntity<>(responseDTO, HttpStatus.NOT_FOUND);
        }
    }
}
