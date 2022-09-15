package com.example.fruitstore;

public class Fruit {

    private String fruitName;

    private double fruitPrice;

    private int fruitPicture;

    public Fruit(String fruitName, double fruitPrice, int fruitPicture) {
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
        this.fruitPicture = fruitPicture;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public int getFruitPicture() {
        return fruitPicture;
    }

    public void setFruitPicture(int fruitPicture) {
        this.fruitPicture = fruitPicture;
    }
}
