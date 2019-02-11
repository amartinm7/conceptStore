package com.amm.concept.store.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BillingAccount {
    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    Store store;

    @OneToMany
    Set<PaymentMethod> paymenthod;
}
