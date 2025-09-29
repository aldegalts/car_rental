package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "car_statuses")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "cars")
public class CarStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cars_status_id", nullable = false)
    @NotNull
    private int carStatusId;

    @Column(name = "status", length = 50, unique = true, nullable = false)
    @NotNull
    private String carStatus;

    @OneToMany(mappedBy = "status")
    private List<Car> cars;
}
