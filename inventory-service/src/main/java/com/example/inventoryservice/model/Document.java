package com.example.inventoryservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Document extends BaseModel{
    private String name;
    private String description;
    private String url;

    @ManyToOne
    private Product product;

    public Document() {
    }

    public Document(String name, String description, String url, Product product) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
