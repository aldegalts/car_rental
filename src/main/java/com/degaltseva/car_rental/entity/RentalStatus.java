package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "rental_statuses")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "rentals")
public class RentalStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_status_id")
    @NotNull
    private int rentalStatusId;

    @Column(name = "status", length = 50, unique = true, nullable = false)
    @NotNull
    private String rentalStatus;

    @OneToMany(mappedBy = "rentalStatus")
    private List<Rental> rentals;
}
