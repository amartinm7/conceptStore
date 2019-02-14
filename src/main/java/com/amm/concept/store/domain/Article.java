package com.amm.concept.store.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@Data
@NoArgsConstructor
@Entity
public class Article {

    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    Catalog catalog;

    String name;

    String brand;

    String picture;
}
