package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;


@Entity
@Table(name = "car_categories")
public class CarCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int categoryId;

    @Column(length = 50, unique = true, nullable = false)
    @NotNull
    private String categoryName;

    @Column(nullable = false)
    @NotNull
    private String description;

    @Column(nullable = false)
    @NotNull
    private int baseCost;

    @OneToMany(mappedBy = "category")
    private List<Cars> cars;
}

