package com.zalora.api.prototype.model;

import javax.persistence.*;

/**
 * Created by zheng on 7/9/14.
 */

@Entity
@Table(name = "catalog_simple")
public class CatalogSimple {
    @Id
    @Column(name = "id_catalog_simple")
    private int id;

    @Column(name = "size_brand")
    private String sizeBrand;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_catalog_config")
    private CatalogConfig catalogConfig;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSizeBrand() {
        return sizeBrand;
    }

    public void setSizeBrand(String sizeBrand) {
        this.sizeBrand = sizeBrand;
    }

    public CatalogConfig getCatalogConfig() {
        return catalogConfig;
    }

    public void setCatalogConfig(CatalogConfig catalogConfig) {
        this.catalogConfig = catalogConfig;
    }
    @Override
    public String toString() {
        return id + " " + sizeBrand + " " + catalogConfig;
    }
}
