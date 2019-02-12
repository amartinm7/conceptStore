package com.amm.concept.store.domain;

import javax.persistence.Embeddable;

@Embeddable
public class CIF {
    // 9 dígitos alfanuméricos
    String cifId;

    public CIF() {
    }

    public CIF(String cifId) {
        this.cifId = cifId;
    }
}
