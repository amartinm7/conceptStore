package com.amm.concept.store.domain.repository;

import com.amm.concept.store.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodDAO extends JpaRepository<PaymentMethod,Long> {
}
