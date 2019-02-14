package com.amm.concept.store.domain;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Catalog {

    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    Store store;

    String catalogRef;

    String name;

    @OneToMany
    Set<Article> articles;

    public Catalog() {
    }

    public Catalog(Store store, String catalogRef, String name, Set<Article> articles) {
        this.store = store;
        this.catalogRef = catalogRef;
        this.name = name;
        this.articles = articles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getCatalogRef() {
        return catalogRef;
    }

    public void setCatalogRef(String catalogRef) {
        this.catalogRef = catalogRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalog)) return false;
        Catalog catalog = (Catalog) o;
        return getCatalogRef().equals(catalog.getCatalogRef());
    }

    @Override
    public int hashCode() {
        return getCatalogRef().hashCode();
    }

    public CatalogVO getCatalogVO(){
        return new CatalogVO (this.getId(), this.getStore(), this.getCatalogRef(), this.getName(), this.getArticles() );
    }

    public static class CatalogVO {
        Long id;
        Store store;
        String catalogRef;
        String name;
        Set<Article> articles;

        public CatalogVO(Long id, Store store, String catalogRef, String name, Set<Article> articles) {
            this.id = id;
            this.store = store;
            this.catalogRef = catalogRef;
            this.name = name;
            this.articles = articles;
        }

        public Long getId() {
            return id;
        }

        public Store getStore() {
            return store;
        }

        public String getCatalogRef() {
            return catalogRef;
        }

        public void setCatalogRef(String catalogRef) {
            this.catalogRef = catalogRef;
        }

        public String getName() {
            return name;
        }

        public Set<Article> getArticles() {
            return articles;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof CatalogVO)) return false;
            CatalogVO catalogVO = (CatalogVO) o;
            if (!getId().equals(catalogVO.getId())) return false;
            if (!getCatalogRef().equals(catalogVO.getCatalogRef())) return false;
            return getName().equals(catalogVO.getName());
        }

        @Override
        public int hashCode() {
            int result = getId().hashCode();
            result = 31 * result + getCatalogRef().hashCode();
            result = 31 * result + getName().hashCode();
            return result;
        }
    }
}
