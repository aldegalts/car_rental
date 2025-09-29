package com.degaltseva.car_rental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "users")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    @NotNull
    private int roleId;

    @Column(name = "role_name", length = 50, unique = true, nullable = false)
    @NotNull
    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<User> users;
}
