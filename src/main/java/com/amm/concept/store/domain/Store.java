package com.amm.concept.store.domain;

import javax.persistence.*;
import java.util.HashSet;
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
    Set<BillingAccount> billingAccount = new HashSet<>();

    @OneToMany
    Set<Address> addresses = new HashSet<>();

    @OneToMany
    Set<Catalog> catalogs = new HashSet<>();

    public Store() {
    }

    public Store(CIF cif, String name, Set<BillingAccount> billingAccount, Set<Address> addresses, Set<Catalog> catalogs) {
        this.cif = cif;
        this.name = name;
        this.billingAccount = billingAccount;
        this.addresses = addresses;
        this.catalogs = catalogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CIF getCif() {
        return cif;
    }

    public void setCif(CIF cif) {
        this.cif = cif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BillingAccount> getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(Set<BillingAccount> billingAccount) {
        this.billingAccount = billingAccount;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(Set<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Store)) return false;
        Store store = (Store) o;
        return getCif().equals(store.getCif());
    }

    @Override
    public int hashCode() {
        return getCif().hashCode();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Store{");
        sb.append("id=").append(id);
        sb.append(", cif=").append(cif);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}