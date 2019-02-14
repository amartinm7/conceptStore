package com.amm.concept.store.application;

import com.amm.concept.store.domain.Store;
import com.amm.concept.store.domain.repository.StoreDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService{

    private StoreDAO storeDAO;

    public StoreServiceImpl(@Autowired StoreDAO storeDAO) {
        this.storeDAO = storeDAO;
    }

    @Override
    public Optional<Store> getStore(Long id){
        return storeDAO.findById(id);
    }
}
