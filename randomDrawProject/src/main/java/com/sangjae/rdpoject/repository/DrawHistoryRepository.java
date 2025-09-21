package com.sangjae.rdpoject.repository;

import com.sangjae.rdpoject.domain.DrawItem;
import com.sangjae.rdpoject.domain.User;
import com.sangjae.rdpoject.repository.storage.DrawHistoryStorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DrawHistoryRepository {

    private final DrawHistoryStorage storage;
    private Map<String, List<DrawItem>> drawHistory = new HashMap<>();

    public DrawHistoryRepository(DrawHistoryStorage storage) {
        this.storage = storage;
        this.drawHistory = storage.loadHistory();
    }

    public void saveDraw(User user, DrawItem item) {
        drawHistory.computeIfAbsent(user.getUserId(), k -> new ArrayList<>()).add(item);
        storage.saveHistory(drawHistory);
    }

    // 유저 기록 조회
    public List<DrawItem> findDrawHistoryByUser(User user) {
        return drawHistory.getOrDefault(user.getUserId(), new ArrayList<>());
    }

    // 전체 기록 조회 (관리자용)
    public Map<String, List<DrawItem>> findAllHistory() {
        return drawHistory;
    }







}

