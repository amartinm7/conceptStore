package com.amm.concept.store.application;

import com.amm.concept.store.domain.Catalog;
import com.amm.concept.store.domain.repository.CatalogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CatalogServiceImpl implements CatalogService {

    private CatalogDAO catalogDAO;

    public CatalogServiceImpl (@Autowired CatalogDAO catalogDAO){
        this.catalogDAO = catalogDAO;
    }

    @Override
    public Optional<Catalog> getCatalog(Long id) {
        return catalogDAO.findById(id);
    }
}
