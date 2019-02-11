package com.amm.concept.store.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class PaymentMethod {
    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    Long id;

    Long bankAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    BillingAccount billingAccount;

//    @OneToMany
//    Set<Paypal> paypal;
}
