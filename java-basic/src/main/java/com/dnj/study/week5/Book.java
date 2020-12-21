package com.dnj.study.week5;

/**
 * @ClassName Book
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/2
 **/
public class Book {
    private String ISBN;
    private String name;
    private int price;

    public Book(String ISBN,String name,int price){
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }
    public Book(){

    }

    

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
