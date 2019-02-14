package com.amm.concept.store.interfaces;

import com.amm.concept.store.application.CatalogService;
import com.amm.concept.store.application.StoreService;
import com.amm.concept.store.infrastructure.messages.CustomResponse;
import com.amm.concept.store.infrastructure.messages.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private CatalogService catalogService;

    public CatalogController(@Autowired CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping ( value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseMessage> getCatalog(@PathVariable("id") Long id, Pageable pageable){
        return catalogService.getCatalog(id)
                .map(catalog -> CustomResponse.getOKMessage(catalog.getCatalogVO()))
                .orElse(CustomResponse.getBadRequestMessage(String.format("there's no any entity with the id %s", id)));
    }

}
