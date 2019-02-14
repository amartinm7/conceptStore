package com.amm.concept.store.domain.repository;

import com.amm.concept.store.domain.BillingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingAccountDAO extends JpaRepository<BillingAccount,Long> {
}
