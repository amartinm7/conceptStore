package com.amm.concept.store.domain;

import com.amm.concept.store.domain.repository.CatalogDAO;
import com.amm.concept.store.domain.repository.StoreDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CatalogDAOIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CatalogDAO catalogDAO;

    @Test
    public void saveStoreIsTrue() {
        //given
        Store store = new Store();
        store.setName("colchonXpress");
        entityManager.persist(store);
        entityManager.flush();

        Catalog catalog = new Catalog();
        catalog.setCatalogRef("colchonesRef");
        catalog.setName("colchones");
        catalog.setStore(store);
        store.getCatalogs().add(catalog);
        entityManager.persist(catalog);
        entityManager.flush();

        Optional<Catalog> catalogOptional = catalogDAO.findById(2L);
        Assert.assertTrue(catalogOptional.isPresent());
    }

}
