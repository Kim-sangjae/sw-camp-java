package com.sangjae.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date menufaturingDate;

    public Product() {
    }

    public Product(String code, String brand, String name, int price, Date menufaturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.menufaturingDate = menufaturingDate;
    }


    public String getInformation(){
        return code + " " + brand + " " + name + " " +price + " " +menufaturingDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getMenufaturingDate() {
        return menufaturingDate;
    }

    public void setMenufaturingDate(Date menufaturingDate) {
        this.menufaturingDate = menufaturingDate;
    }
}
