package com.amm.concept.store.application;

import com.amm.concept.store.domain.Catalog;
import java.util.Optional;

public interface CatalogService {
    Optional<Catalog> getCatalog (Long id);
}
