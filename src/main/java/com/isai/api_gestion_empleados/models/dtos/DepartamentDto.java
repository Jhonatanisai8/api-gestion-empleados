package com.isai.api_gestion_empleados.models.dtos;

import java.util.List;

import com.isai.api_gestion_empleados.models.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartamentDto {
    private String codeDepartament;

    private String nameDepartament;

    private String city;

    private String codeDirector;

    private List<Employee> employees;
}
