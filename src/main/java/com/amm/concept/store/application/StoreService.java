package com.amm.concept.store.application;

import com.amm.concept.store.domain.Store;

import java.util.Optional;

public interface StoreService {
    public Optional<Store> getStore(Long id);
}
