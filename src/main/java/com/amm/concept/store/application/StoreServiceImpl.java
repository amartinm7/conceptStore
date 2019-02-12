package com.amm.concept.store.application;

import com.amm.concept.store.domain.Store;
import com.amm.concept.store.domain.repository.StoreDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StoreServiceImpl implements StoreService{
    @Autowired
    private StoreDAO storeDAO;

    public StoreServiceImpl() {
    }

    public StoreServiceImpl(StoreDAO storeDAO) {
        this.storeDAO = storeDAO;
    }

    @Override
    public Optional<Store> getStore(Long id){
        return storeDAO.findById(id);
    }
}
