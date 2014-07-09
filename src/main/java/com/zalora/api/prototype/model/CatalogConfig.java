package com.zalora.api.prototype.model;

import javax.persistence.*;

/**
 * Created by zheng on 7/9/14.
 */

@Entity
@Table(name = "catalog_config")
public class CatalogConfig {
    @Id
    @Column(name = "id_catalog_config")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + color;
    }
}
