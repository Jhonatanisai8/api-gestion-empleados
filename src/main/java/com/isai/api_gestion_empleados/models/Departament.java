package com.isai.api_gestion_empleados.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
import lombok.ToString;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@ToString(exclude = "employees")
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

    @JsonIgnore
    @OneToMany(mappedBy = "departament", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Employee> employees;
}
