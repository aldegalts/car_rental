package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "rentals")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false)
    @NotNull
    private int clientId;

    @Column(name = "name", length = 100, nullable = false)
    @NotNull
    private String name;

    @Column(name = "surname", length = 100, nullable = false)
    @NotNull
    private String surname;

    @Column(name = "birth_date", nullable = false)
    @NotNull
    private LocalDate birthDate;

    @Column(name = "phone", length = 11, nullable = false)
    @NotNull
    private String phone;

    @Column(name = "email", length = 100, nullable = false)
    @NotNull
    private String email;

    @Column(name = "driver_license", length = 50, unique = true, nullable = false)
    @NotNull
    private String driverLicense;

    @Column(name = "license_expiry_date", nullable = false)
    @NotNull
    private LocalDate licenseExpiryDate;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    @NotNull
    private User user;

    @OneToMany(mappedBy = "client")
    private List<Rental> rentals;
}
