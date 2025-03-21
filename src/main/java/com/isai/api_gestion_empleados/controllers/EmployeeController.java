package com.isai.api_gestion_empleados.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isai.api_gestion_empleados.models.dtos.EmployeeDto;
import com.isai.api_gestion_empleados.service.impl.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/findAllEmployees")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<EmployeeDto>> findAllEmployees() {
        return ResponseEntity.ok()
                .body(employeeService.findAll());
    }

}
