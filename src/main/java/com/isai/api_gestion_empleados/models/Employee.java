package com.isai.api_gestion_empleados.models;

import java.util.Date;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

    @ManyToOne
    @JoinColumn(name = "boos_id", referencedColumnName = "employeeId")
    private Employee boos;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "code_departament", referencedColumnName = "codeDepartament")
    private Departament departament;
}
