package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude= "client")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    @NotNull
    private int userId;

    @Column(name = "username", length = 100, unique = true, nullable = false)
    @NotNull
    private String username;

    @Column(name = "password", nullable = false)
    @NotNull
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    @NotNull
    private Role role;

    @OneToOne(mappedBy = "user")
    private Client client;
}
