package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "accounts")

@Getter @Setter
@ToString
public class Account {
    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    Client client;

    @Column(name = "value")
    Double value;

    @Column(name = "currency")
    String currency;
}
