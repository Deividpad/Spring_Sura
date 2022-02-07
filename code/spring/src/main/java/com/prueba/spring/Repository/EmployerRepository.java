package com.prueba.spring.Repository;

import com.prueba.spring.models.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
    List<Employer> findByDni(int dni);
}