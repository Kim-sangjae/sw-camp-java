package com.sangjae.section01.list.comparator;

import com.sangjae.section01.list.dto.BookDTO;

import java.util.Comparator;
                                        // BookDTO , BookDTO 자식 으로 한정
public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        // 비교대상 두인스턴스의 price가 오름차순 되려면
        // o1의 가격이 더 작은가격
        // o2의 가격이 더 크면 음수가 나오므로 위치 변경

        return o1.getPrice()-o2.getPrice();
    }


}
