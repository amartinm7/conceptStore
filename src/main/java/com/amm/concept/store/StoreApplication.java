package com.amm.concept.store;

import com.amm.concept.store.domain.Store;
import com.amm.concept.store.domain.repository.StoreDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

	private StoreDAO storeDAO;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Override
	public void run (String[] args) throws Exception{

		Store store = new Store();
		store.setName("MyConceptStore");
		// storeDAO.save(store);
	}
}

