package com.amm.concept.store.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Set;

@Slf4j
@Data
@NoArgsConstructor
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