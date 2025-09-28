package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.Year;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int carId;

    @Column(length = 50, nullable = false)
    @NotNull
    private String brand;

    @Column(length = 50, nullable = false)
    @NotNull
    private String model;

    @Column(nullable = false)
    @NotNull
    private Year year;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @NotNull
    private CarCategories category;

    @Column(length = 20, unique = true, nullable = false)
    @NotNull
    private String license_plate;

    @ManyToOne
    @JoinColumn(name = "color_id", nullable = false)
    @NotNull
    private CarColors color;

    @Column(nullable = false)
    @NotNull
    private int dailyCost;

    @ManyToOne
    @JoinColumn(name = "car_status_id", nullable = false)
    @NotNull
    private CarStatuses status;
}
