package com.sangjae.rdpoject.service;

import com.sangjae.rdpoject.domain.Category;
import com.sangjae.rdpoject.domain.DrawItem;
import com.sangjae.rdpoject.domain.User;
import com.sangjae.rdpoject.repository.DrawHistoryRepository;
import com.sangjae.rdpoject.repository.DrawRepository;

import java.util.*;

public class DrawService {

    private final DrawRepository drawRepository;
    private final DrawHistoryRepository historyRepository;
    private final Random random = new Random();

    public DrawService(DrawRepository drawRepository, DrawHistoryRepository historyRepository) {
        this.drawRepository = drawRepository;
        this.historyRepository = historyRepository;
    }

    // 전체 아이템 조회
    public List<DrawItem> getAllItems() {
        return drawRepository.findAllItems();
    }

    // 전체 기록 조회
    public Map<String, List<DrawItem>> getAllHistory() {
        return historyRepository.findAllHistory();
    }

    // 유저별 기록 조회
    public List<DrawItem> getDrawHistory(User user) {
        return historyRepository.findDrawHistoryByUser(user);
    }

    // 뽑기 실행
    public void startDraw(User user, int cost) {
        if (user.getMoney() < cost) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }

        List<DrawItem> items = drawRepository.findAllItems();
        if (items.isEmpty()) {
            throw new IllegalArgumentException("아이템이 없습니다.");
        }

        user.updateMoney(-cost);

        DrawItem item = items.get(random.nextInt(items.size()));

        itemView(item);


        historyRepository.saveDraw(user, item);


        drawRepository.removeItem(item);

    }



    // 아이템 추가
    public void addItem(String itemName, String itemContent, Category category) {
        drawRepository.addItem(itemName, itemContent, category);
    }


    // 뽑기아이템 print
    public void itemView(DrawItem item){
        String top = "┌──────────────────────────────────────┐";
        String bot = "└──────────────────────────────────────┘";

        System.out.println(top);
        System.out.printf("  %-38s \n", "🎉 뽑기 결과 🎉");
        System.out.println("├──────────────────────────────────────┤");
        System.out.printf("  코드     : %-30d \n", item.getItemCode());
        System.out.printf("  이름     : %-30s \n", item.getItemName());
        System.out.printf("  카테고리  : %-30s \n", item.getCategory());
        System.out.printf("  설명     : %-30s \n", item.getItemContent());
        System.out.println(bot);
    }



    //뽑기횟수 랭킹
    public void printUserRanking() {
        List<String[]> rankingList = new ArrayList<>();


        historyRepository.findAllHistory().forEach((userId, items) -> {
            rankingList.add(new String[]{userId, String.valueOf(items.size())});
        });


        rankingList.sort((a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));

        int rank = 1;
        for (String[] entry : rankingList) {
            System.out.printf("%d위 | %s :%s회\n", rank++, entry[0], entry[1]);
        }
    }
}
