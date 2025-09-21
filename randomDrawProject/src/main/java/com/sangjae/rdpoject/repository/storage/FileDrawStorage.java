package com.sangjae.rdpoject.repository.storage;

import com.sangjae.rdpoject.domain.DrawItem;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileDrawStorage implements DrawStorage{

    private static final String FILE_PATH =  "src/main/java/com/sangjae/rdpoject/db/itemDB.dat";

    @Override
    public void saveItems(List<DrawItem> items) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(items);
        } catch (IOException e) {
            throw new RuntimeException("Item 저장 중 오류", e);
        }
    }

    @Override
    public List<DrawItem> loadItems() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return new ArrayList<>();

        if (file.length() == 0) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<DrawItem>) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException("Item 로딩 중 오류", e);
        }
    }


}