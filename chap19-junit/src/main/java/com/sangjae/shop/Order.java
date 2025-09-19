package com.sangjae.shop;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private final long id;
    private final List<OrderItem> items;
    private final LocalDateTime createdAt;



    public Order(long id, List<OrderItem> items, LocalDateTime createdAt) {
        this.id = id;
        this.items = items;
        this.createdAt = createdAt;
    }


    public long getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int totalPrice(){
        return items.stream().mapToInt(order -> order.lineTotal()).sum();
    }
}
