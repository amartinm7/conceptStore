package com.amm.concept.store.domain.repository;

import com.amm.concept.store.domain.BillingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAccountDAO extends JpaRepository<BillingAccount,Long> {
}
