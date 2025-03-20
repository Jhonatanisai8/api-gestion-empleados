package com.isai.api_gestion_empleados.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Departament {

    @Id
    @Column(length = 4)
    private String codeDepartament;

    @Column(length = 20, nullable = false)
    private String nameDepartament;

    @Column(length = 15)
    private String city;

    @Column(length = 12)
    private String codeDirector;

    @OneToMany(mappedBy = "departament", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employees;
}
