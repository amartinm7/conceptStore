package com.amm.concept.store.domain.repository;

import com.amm.concept.store.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDAO extends JpaRepository<Store,Long> {
}
