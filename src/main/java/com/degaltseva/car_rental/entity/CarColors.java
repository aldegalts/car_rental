package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "car_colors")
public class CarColors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int colorId;

    @NotNull
    @Column(length = 50, unique = true, nullable = false)
    private String color;

    @OneToMany(mappedBy = "color")
    private List<Cars> cars;
}
