package com.amm.concept.store.interfaces;

import com.amm.concept.store.application.StoreService;
import com.amm.concept.store.domain.Store;
import com.amm.concept.store.infrastructure.messages.CustomResponse;
import com.amm.concept.store.infrastructure.messages.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    private StoreService storeService;

    public StoreController(@Autowired StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping ( value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseMessage> getStore(@PathVariable("id") Long id){
        return storeService.getStore(id)
                .map(store -> CustomResponse.getOKMessage(store))
                .orElse(CustomResponse.getBadRequestMessage(String.format("there's no any entity with the id %s", id)));
    }

}
