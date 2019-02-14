package com.amm.concept.store.domain;

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
public class StoreDAOIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private StoreDAO storeDAO;

    @Test
    public void saveStoreIsTrue() {
        //given
        Store store = new Store();
        store.setName("testStore");
        entityManager.persist(store);
        entityManager.flush();

        Optional<Store> storeTemp = storeDAO.findById(store.getId());
        Assert.assertTrue(storeTemp.isPresent());
    }
}
