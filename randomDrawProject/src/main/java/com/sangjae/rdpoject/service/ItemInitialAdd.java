package com.sangjae.rdpoject.service;

import com.sangjae.rdpoject.domain.Category;
import com.sangjae.rdpoject.domain.DrawItem;

import java.util.ArrayList;
import java.util.List;

public class ItemInitialAdd {


    // controller 에서 실행할 때 초기에 아이템이 하나도 없을때만 실행 될 초기 데이터입니다!!
    // 초기 아이템 설정
    public static List<DrawItem> createInitialItems() {
        List<DrawItem> items = new ArrayList<>();
        int code = 1;

        // 포유류
        items.add(new DrawItem(code++, "사자", "백수의 왕", Category.포유류));
        items.add(new DrawItem(code++, "호랑이", "정글의 왕", Category.포유류));
        items.add(new DrawItem(code++, "코끼리", "코가 손인 동물아저씨", Category.포유류));
        items.add(new DrawItem(code++, "원숭이", "사람과 닮은 동물", Category.포유류));
        items.add(new DrawItem(code++, "기린", "목이 긴 초식동물", Category.포유류));

        // 어류
        items.add(new DrawItem(code++, "연어", "강물을 거꾸로 거슬러 오르는 물고기", Category.어류));
        items.add(new DrawItem(code++, "상어", "바다의 포식자", Category.어류));
        items.add(new DrawItem(code++, "금붕어", "금붕금붕", Category.어류));
        items.add(new DrawItem(code++, "광어", "눈이 몰린 횟감", Category.어류));
        items.add(new DrawItem(code++, "가오리", "평평한 몸체의 어류", Category.어류));

        // 조류
        items.add(new DrawItem(code++, "독수리", "하늘의 왕자", Category.조류));
        items.add(new DrawItem(code++, "펭귄", "남극의 날지못하는 새", Category.조류));
        items.add(new DrawItem(code++, "비둘기", "민폐 새", Category.조류));
        items.add(new DrawItem(code++, "참새", "짹짹", Category.조류));
        items.add(new DrawItem(code++, "부엉이", "밤하늘의 제왕", Category.조류));

        // 파충류
        items.add(new DrawItem(code++, "악어", "강력한 포식자", Category.파충류));
        items.add(new DrawItem(code++, "도마뱀", "작고 민첩한 파충류", Category.파충류));
        items.add(new DrawItem(code++, "거북이", "느리지만 오래사는 동물", Category.파충류));
        items.add(new DrawItem(code++, "뱀", "독을 가진 파충류", Category.파충류));
        items.add(new DrawItem(code++, "카멜레온", "색을 바꾸는 도마뱀", Category.파충류));

        // 갑각류
        items.add(new DrawItem(code++, "게", "바닷가의 작은 갑각류", Category.갑각류));
        items.add(new DrawItem(code++, "새우", "맛있는 바다 동물", Category.갑각류));
        items.add(new DrawItem(code++, "랍스터", "고급 식재료", Category.갑각류));
        items.add(new DrawItem(code++, "대게", "대게 대게맛있다", Category.갑각류));
        items.add(new DrawItem(code++, "소라 게", "자기집을 가지고다니는 게", Category.갑각류));

        return items;
    }
}
