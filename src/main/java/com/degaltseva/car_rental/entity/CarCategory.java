package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "car_categories")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "cars")
public class CarCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false)
    @NotNull
    private int categoryId;

    @Column(name = "category_name", length = 50, unique = true, nullable = false)
    @NotNull
    private String categoryName;

    @Column(name = "description", nullable = false)
    @NotNull
    private String description;

    @Column(name = "base_cost", nullable = false)
    @NotNull
    private int baseCost;

    @OneToMany(mappedBy = "category")
    private List<Car> cars;
}

