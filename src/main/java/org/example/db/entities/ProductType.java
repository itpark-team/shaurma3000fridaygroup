package org.example.db.entities;

public class ProductType {
    private int id;
    private String name;

    public ProductType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
