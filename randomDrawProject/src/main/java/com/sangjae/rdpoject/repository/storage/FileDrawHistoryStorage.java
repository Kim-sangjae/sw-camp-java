package com.sangjae.rdpoject.repository.storage;

import com.sangjae.rdpoject.domain.DrawItem;

import java.io.*;
import java.util.*;

public class FileDrawHistoryStorage implements DrawHistoryStorage {
    private static final String FILE_PATH = "src/main/java/com/sangjae/rdpoject/db/drawHistoryDB.dat";

    @Override
    public void saveHistory(Map<String, List<DrawItem>> history) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(history);
        } catch (IOException e) {
            throw new RuntimeException("DrawHistory 저장 중 오류", e);
        }
    }

    @Override
    public Map<String, List<DrawItem>> loadHistory() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return new HashMap<>();

        if (file.length() == 0) {
            return new HashMap<>();
        }



        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Map<String, List<DrawItem>>) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException("DrawHistory 로딩 중 오류", e);
        }
    }
}
