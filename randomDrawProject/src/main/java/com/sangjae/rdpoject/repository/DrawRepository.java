package com.sangjae.rdpoject.repository;

import com.sangjae.rdpoject.domain.Category;
import com.sangjae.rdpoject.domain.DrawItem;
import com.sangjae.rdpoject.domain.User;
import com.sangjae.rdpoject.repository.storage.DrawHistoryStorage;
import com.sangjae.rdpoject.repository.storage.DrawStorage;
import com.sangjae.rdpoject.service.ItemInitialAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DrawRepository {
    private final DrawStorage storage;
    private final List<DrawItem> items;
    private int nextItemCode = 1;

    public DrawRepository(DrawStorage storage) {
        this.storage = storage;
        this.items = storage.loadItems();


        if (!items.isEmpty()) {
            int maxNum = items.stream()
                    .mapToInt(DrawItem::getItemCode)
                    .max().getAsInt();


            this.nextItemCode = maxNum + 1;
        }

    }

    public void addItem(String itemName, String itemContent, Category category) {
        DrawItem newItem = new DrawItem(nextItemCode++, itemName, itemContent, category);
        items.add(newItem);
        storage.saveItems(items);
    }

    public List<DrawItem> findAllItems() {
        return items;
    }


    public List<DrawItem> findItemsByCategory(Category category) {
        return items.stream()
                .filter(item -> item.getCategory() == category)
                .collect(Collectors.toList());
    }


    public void removeItem(DrawItem item) {
        items.remove(item);
        storage.saveItems(items);
    }


    // 초기 아이템 저장
    public void saveAllItems(List<DrawItem> newItems) {
        this.items.addAll(newItems);
        storage.saveItems(items); // 파일에 저장
    }
}
