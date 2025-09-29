package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "car_colors")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "cars")
public class CarColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id", nullable = false)
    @NotNull
    private int colorId;

    @Column(name = "color", length = 50, unique = true, nullable = false)
    @NotNull
    private String color;

    @OneToMany(mappedBy = "color")
    private List<Car> cars;
}
