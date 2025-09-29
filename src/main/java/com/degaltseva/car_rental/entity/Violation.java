package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "violations")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Violation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "violation_id", nullable = false)
    @NotNull
    private int violationId;

    @ManyToOne()
    @JoinColumn(name = "rental_id", nullable = false)
    @NotNull
    private Rental rental;

    @ManyToOne()
    @JoinColumn(name = "violation_type_id")
    @NotNull
    private ViolationType type;

    @Column(name = "description", nullable = false)
    @NotNull
    private String description;

    @Column(name = "fine_amount", nullable = false)
    @NotNull
    private int fineAmount;

    @Column(name = "violation_date", nullable = false)
    @NotNull
    private LocalDate violationDate;

    @Column(name = "is_paid", nullable = false)
    @NotNull
    private boolean isPaid;
}
