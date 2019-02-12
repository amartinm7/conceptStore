package com.amm.concept.store.application;

import com.amm.concept.store.domain.CIF;
import com.amm.concept.store.domain.Store;
import com.amm.concept.store.domain.repository.StoreDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
public class StoreServiceTest {

    @Autowired
    private StoreService storeService;

    @MockBean
    private StoreDAO storeDAO;

    @TestConfiguration
    static class StoreServiceImplTestContextConfiguration{

        @Bean
        public StoreService storeService(){
            return new StoreServiceImpl();
        }
    }

    @Before
    public void setUp() {
        Store store = new Store();
        store.setName("conceptStore");
        store.setId(1L);
        store.setCif(new CIF("CIF123456"));
        Mockito.when(storeDAO.findById(1L)).thenReturn(Optional.of(store));
    }

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        String name = "conceptStore";
        Optional<Store> found = storeService.getStore(1L);
        Assert.assertEquals(found.get().getName(), name);
    }
}
