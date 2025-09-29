package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "violation_types")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "violations")
public class ViolationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "violation_type_id")
    @NotNull
    private int violationTypeId;

    @Column(name = "type_name", length = 100, nullable = false)
    @NotNull
    private String violationTypeName;

    @Column(name = "default_fine", nullable = false)
    @NotNull
    private int defaultFine;

    @Column(name= "description", nullable = false)
    @NotNull
    private String description;

    @OneToMany(mappedBy = "type")
    private List<Violation> violations;
}
