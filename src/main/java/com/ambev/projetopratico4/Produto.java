package com.ambev.projetopratico4;

public class Produto {
    private String id;
    private String name;
    private String description;
    private double price;
    private boolean isSparklingWater;
    private boolean isDietSoftDrink;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSparklingWater() {
        return isSparklingWater;
    }

    public void setSparklingWater(boolean sparklingWater) {
        isSparklingWater = sparklingWater;
    }

    public boolean isDietSoftDrink() {
        return isDietSoftDrink;
    }

    public void setDietSoftDrink(boolean dietSoftDrink) {
        isDietSoftDrink = dietSoftDrink;
    }
}

