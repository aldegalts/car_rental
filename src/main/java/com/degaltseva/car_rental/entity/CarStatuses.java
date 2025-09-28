package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "car_statuses")
public class CarStatuses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int carStatusId;

    @Column(length = 50, unique = true, nullable = false)
    @NotNull
    private String status;

    @OneToMany(mappedBy = "status")
    private List<Cars> cars;
}
