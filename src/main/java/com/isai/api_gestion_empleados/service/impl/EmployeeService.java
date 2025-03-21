package com.isai.api_gestion_empleados.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isai.api_gestion_empleados.models.Employee;
import com.isai.api_gestion_empleados.models.dtos.EmployeeDto;
import com.isai.api_gestion_empleados.repository.EmployeeRepository;
import com.isai.api_gestion_empleados.service.CrudService;

@Service
public class EmployeeService
        implements CrudService<EmployeeDto> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto create(EmployeeDto T) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public EmployeeDto update(EmployeeDto T, String code) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String code) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public EmployeeDto findById(String code) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<EmployeeDto> findAll() {
        return employeeRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
    }

    private EmployeeDto convertToDto(Employee employee) {
        return EmployeeDto.builder()
                .employeeId(employee.getEmployeeId())
                .firstName(employee.getFirstName())
                .sex(employee.getSex())
                .dateBirth(employee.getDateBirth())
                .dateIncorporation(employee.getDateIncorporation())
                .salary(employee.getSalary())
                .commission(employee.getCommission())
                .cargo(employee.getCargo())
                .boss(employee.getBoss())
                .departament(employee.getDepartament())
                .build();
    }

    private Employee convertToEntity(EmployeeDto employeeDto) {
        return Employee.builder()
                .employeeId(employeeDto.getEmployeeId())
                .firstName(employeeDto.getFirstName())
                .sex(employeeDto.getSex())
                .dateBirth(employeeDto.getDateBirth())
                .dateIncorporation(employeeDto.getDateIncorporation())
                .salary(employeeDto.getSalary())
                .commission(employeeDto.getCommission())
                .cargo(employeeDto.getCargo())
                .boss(employeeDto.getBoss())
                .departament(employeeDto.getDepartament())
                .build();
    }

}