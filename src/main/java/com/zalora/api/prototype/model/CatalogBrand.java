package com.zalora.api.prototype.model;

import javax.persistence.*;

/**
 * Created by zheng on 7/9/14.
 */
@Entity
@Table(name = "catalog_brand")
public class CatalogBrand {
    @Id
    @Column(name = "id_catalog_brand")
    private int idCatalogBrand;

    @Column(name = "name")
    private String name;

    public int getIdCatalogBrand() {
        return idCatalogBrand;
    }

    public void setIdCatalogBrand(int idCatalogBrand) {
        this.idCatalogBrand = idCatalogBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
