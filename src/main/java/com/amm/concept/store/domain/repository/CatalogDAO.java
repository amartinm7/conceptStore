package com.amm.concept.store.domain.repository;

import com.amm.concept.store.domain.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogDAO extends JpaRepository<Catalog,Long> {
}
