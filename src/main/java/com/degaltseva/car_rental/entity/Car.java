package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.Year;
import java.util.List;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "rentals")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", nullable = false)
    @NotNull
    private int carId;

    @Column(name = "brand", length = 50, nullable = false)
    @NotNull
    private String brand;

    @Column(name = "model", length = 50, nullable = false)
    @NotNull
    private String model;

    @Column(name = "year", nullable = false)
    @NotNull
    private Year year;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @NotNull
    private CarCategory category;

    @Column(name = "license_plate", length = 20, unique = true, nullable = false)
    @NotNull
    private String licensePlate;

    @ManyToOne
    @JoinColumn(name = "color_id", nullable = false)
    @NotNull
    private CarColor color;

    @Column(name = "daily_cost", nullable = false)
    @NotNull
    private int dailyCost;

    @ManyToOne
    @JoinColumn(name = "car_status_id", nullable = false)
    @NotNull
    private CarStatus status;

    @OneToMany(mappedBy = "car")
    private List<Rental> rentals;
}
