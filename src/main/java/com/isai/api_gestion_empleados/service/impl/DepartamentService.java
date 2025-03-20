package com.isai.api_gestion_empleados.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isai.api_gestion_empleados.models.Departament;
import com.isai.api_gestion_empleados.models.dtos.DepartamentDto;
import com.isai.api_gestion_empleados.repository.DepartamentRepository;
import com.isai.api_gestion_empleados.service.CrudService;

@Service
public class DepartamentService
        implements CrudService<DepartamentDto> {

    @Autowired
    private DepartamentRepository departamentRepository;

    @Override
    public DepartamentDto create(DepartamentDto T) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(String code) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<DepartamentDto> findAll() {
        return departamentRepository.findAll().stream()
                .map(this::convertToEntity)
                .toList();
    }

    @Override
    public DepartamentDto findById(String code) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DepartamentDto update(DepartamentDto T, String code) {
        // TODO Auto-generated method stub
        return null;
    }

    private DepartamentDto convertToEntity(Departament departament) {
        return DepartamentDto.builder()
                .codeDepartament(departament.getCodeDepartament())
                .nameDepartament(departament.getNameDepartament())
                .city(departament.getCity())
                .codeDirector(departament.getCodeDirector())
                .employees(departament.getEmployees())
                .build();
    }

    private Departament convertToDto(DepartamentDto departamentDto) {
        return Departament.builder()
                .codeDepartament(departamentDto.getCodeDepartament())
                .nameDepartament(departamentDto.getNameDepartament())
                .city(departamentDto.getCity())
                .codeDirector(departamentDto.getCodeDirector())
                .employees(departamentDto.getEmployees())
                .build();
    }

}
