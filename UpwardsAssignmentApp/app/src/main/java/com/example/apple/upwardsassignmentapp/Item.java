package com.example.apple.upwardsassignmentapp;

public class Item {
    private String brand_name, name, size;

    public Item() {
    }

    public Item(String brand_name, String name, String size) {
        this.brand_name = brand_name;
        this.name = name;
        this.size = size;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return  size;
    }
}
