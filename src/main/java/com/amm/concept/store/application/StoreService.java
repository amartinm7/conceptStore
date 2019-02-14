package com.amm.concept.store.application;

import com.amm.concept.store.domain.Store;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface StoreService {
    Optional<Store> getStore(Long id);
}
