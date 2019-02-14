package com.amm.concept.store.domain.adapters;

import com.amm.concept.store.domain.Catalog;
import com.amm.concept.store.domain.ports.CatalogQueryPort;
import com.amm.concept.store.domain.repository.CatalogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service
public class CatalogQueryAdapter implements CatalogQueryPort {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private CatalogDAO catalogDAO;

    public CatalogQueryAdapter(@Autowired CatalogDAO catalogDAO) {
        this.catalogDAO = catalogDAO;
    }

    public Optional<Catalog> getCatalog(Long id){
        return catalogDAO.findById(id);
    }


}
