package com.sangjae.rdpoject.repository.storage;

import com.sangjae.rdpoject.domain.DrawItem;

import java.util.List;
import java.util.Map;

public interface DrawHistoryStorage {
    void saveHistory(Map<String, List<DrawItem>> history);
    Map<String, List<DrawItem>> loadHistory();
}
