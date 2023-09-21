package com.codedifferently;

public class Book {
    private Double price;

    private String title;

    public Book(String titles, Double price) {
        this.title = titles;
        this.price = price;

    }


    public String getTitles() {
        return title;
    }

    public void setTitles(String titles) {
        this.title = titles;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return String.format("%s, %.2f", title, price);

    }
}