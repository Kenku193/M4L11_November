package org.example.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clients")

@Getter @Setter
@ToString
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;
}
