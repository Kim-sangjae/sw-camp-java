package com.sangjae.rdpoject.repository.storage;



import com.sangjae.rdpoject.domain.DrawItem;

import java.util.List;
import java.util.Map;

public interface DrawStorage {
   void saveItems(List<DrawItem> items);
   List<DrawItem> loadItems();

}
