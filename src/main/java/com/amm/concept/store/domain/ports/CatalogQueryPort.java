package com.amm.concept.store.domain.ports;

import com.amm.concept.store.domain.Catalog;

import java.util.Optional;

public interface CatalogQueryPort {
    Optional<Catalog> getCatalog(Long id);
}
