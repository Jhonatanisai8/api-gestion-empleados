package com.isai.api_gestion_empleados.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "departament")
public class Employee {

    @Id
    @Column(length = 12)
    private String employeeId;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 1, nullable = false)
    private Character sex;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateIncorporation;

    private Float salary;
    private Float commission;

    @Column(length = 15)
    private String cargo;

    @JsonIgnore // evita que la relación vuelva a serializarse en bucle
    @ManyToOne
    @JoinColumn(name = "boss_id", referencedColumnName = "employeeId")
    private Employee boss;

    @JsonIgnore // evita que la relación vuelva a serializarse en bucle
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "code_departament", referencedColumnName = "codeDepartament")
    private Departament departament;
}
