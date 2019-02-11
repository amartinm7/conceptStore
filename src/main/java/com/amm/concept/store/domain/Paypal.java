package com.amm.concept.store.domain;

import javax.persistence.*;

@Entity
public class Paypal {
    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    Long id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    PaymentMethod paymentMethod;

    String user;
}
