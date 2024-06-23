package com.example.mycoffeapp.models;

<<<<<<< HEAD
public class CartModel {
=======
public class CardModel {
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
    int image;
    String name;
    String price;
    String rating;

<<<<<<< HEAD
    public CartModel(int image, String name, String price, String rating) {
=======
    public CardModel(int image, String name, String price, String rating) {
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
        this.image = image;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
