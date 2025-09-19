package com.sangjae.shop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// 주문 서비스 : 주문항목을 받아 order를 만들고 메모리에 저장
public class OrderService {

    // 프로그램이 실행 되는 동안만 주문을 보관하는 임의저장소 (추후에는 DB 저장)
    private final List<Order> orders = new ArrayList<>();

    // 주문 번호 카운팅용 변수
    private long sequence = 0;

    // 주문 생성 : 검증 -> 번호 발급 -> 생성시간기록 -> 저장
    public Order placeOrder (List<OrderItem> items){
        validate(items);


        sequence++; // 검증 통과하면 시퀀스 증가 (주문번호)

        Order order = new Order(sequence,items, LocalDateTime.now());

        orders.add(order); // 위에 생성해놓은 임시 메모리공간 List에 저장

        return order;
    }


    // 전체 주문 목록 조회
    public List<Order> ListAll(){return orders;}


    // 입력 검증용 private 메서드
    private void validate(List<OrderItem> item){
        if(item == null || item.isEmpty()){
            throw new IllegalArgumentException("주문 항목이 비어있습니다");
        }

        // anymatch : 하나라도 true라면 true 값이 나옴
        boolean invalid = item.stream()
                .anyMatch(i -> i.getQuantity() <= 0 || i.getUnitPrice() < 0);

        if(invalid){
            throw new IllegalArgumentException("수량은 1 이상 , 가격은 0 이상이어야 합니다.");
        }
    }


}
