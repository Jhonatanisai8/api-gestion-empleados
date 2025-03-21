package com.isai.api_gestion_empleados.models.dtos;

import java.util.Date;

import com.isai.api_gestion_empleados.models.Departament;
import com.isai.api_gestion_empleados.models.Employee;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {
    private String employeeId;

    private String firstName;

    private Character sex;

    private Date dateBirth;

    private Date dateIncorporation;

    private Float salary;

    private Float commission;

    private String cargo;

    private Employee boos;

    private Departament departament;
}
