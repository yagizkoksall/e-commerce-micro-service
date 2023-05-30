package com.example.inventoryservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
public class Category extends BaseModel{

    private String name;


    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
    List<Product> products = new ArrayList<>();

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
