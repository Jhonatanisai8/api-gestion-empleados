package com.isai.api_gestion_empleados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.isai.api_gestion_empleados.models.dtos.DepartamentDto;
import com.isai.api_gestion_empleados.service.impl.DepartamentService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/departaments")
public class DepartamentController {

    @Autowired
    private DepartamentService departamentService;

    @GetMapping("/findAllDepartaments")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<DepartamentDto>> findAllDepartaments() {
        return ResponseEntity.ok()
                .body(departamentService.findAll());
    }

}
