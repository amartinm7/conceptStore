package com.amm.concept.store.domain;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    Store store;

    String streetName;
    Long numberOf;
    Long postalCode;
    String town;
    String province;
}
