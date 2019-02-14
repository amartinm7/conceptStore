package com.amm.concept.store.domain.repository;

import com.amm.concept.store.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDAO extends JpaRepository<Address,Long> {
}
