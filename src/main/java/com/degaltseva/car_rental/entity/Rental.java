package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "rentals")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "violations")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id", nullable = false)
    @NotNull
    private int rentalId;

    @ManyToOne()
    @JoinColumn(name = "client_id", nullable = false)
    @NotNull
    private Client client;

    @ManyToOne()
    @JoinColumn(name = "car_id", nullable = false)
    @NotNull
    private Car car;

    @Column(name = "start_date", nullable = false)
    @NotNull
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    @NotNull
    private LocalDate endDate;

    @Column(name = "total_amount", nullable = false)
    @NotNull
    private int totalAmount;

    @ManyToOne()
    @JoinColumn(name = "rental_status_id", nullable = false)
    @NotNull
    private RentalStatus status;

    @OneToMany(mappedBy = "rental")
    private List<Violation> violations;
}
