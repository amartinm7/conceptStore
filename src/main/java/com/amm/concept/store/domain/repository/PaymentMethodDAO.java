package com.amm.concept.store.domain.repository;

import com.amm.concept.store.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodDAO extends JpaRepository<PaymentMethod,Long> {
}
