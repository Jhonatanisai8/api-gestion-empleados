package com.isai.api_gestion_empleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isai.api_gestion_empleados.models.Departament;

@Repository
public interface DepartamentRepository
        extends JpaRepository<Departament, String> {

}
