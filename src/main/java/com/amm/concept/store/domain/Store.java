package com.amm.concept.store.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Store{
    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    Long id;

    @Embedded
    CIF cif;

    String name;

    @OneToMany
    Set<BillingAccount> billingAccount;

    @OneToMany
    Set<Address> addresses;

}