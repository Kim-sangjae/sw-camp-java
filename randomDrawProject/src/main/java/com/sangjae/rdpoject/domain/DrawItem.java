package com.sangjae.rdpoject.domain;

import java.io.Serializable;

public class DrawItem implements Serializable {
    private int itemCode;
    private String itemName;
    private String itemContent;
    private Category category;


    public DrawItem(int itemCode, String itemName, String itemContent, Category category) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemContent = itemContent;
        this.category = category;
    }

    public int getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public Category getCategory() {
        return category;
    }



    public String getItemContent() {
        return itemContent;
    }

    @Override
    public String toString() {
        return "DrawItem{" +
                "itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", itemContent='" + itemContent + '\'' +
                ", category=" + category +
                '}';
    }
}
