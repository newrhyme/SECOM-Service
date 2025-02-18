package com.aivnautics.secom_test.models.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.UUID;

import static jakarta.persistence.GenerationType.*;

@Entity
@Getter
@Setter
public class Subscription implements Serializable {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @SequenceGenerator(name="subscription_generator", sequenceName = "subscription_generator_seq", allocationSize=1)
    @Column(name = "id", nullable = false)
    private BigInteger id;

    @Column(unique = true)
    private UUID uuid;

    private String mrn;
}
