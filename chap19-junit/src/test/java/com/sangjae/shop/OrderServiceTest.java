package com.sangjae.shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    private OrderService orderService;

    @BeforeEach
    void setUp(){
        orderService = new OrderService();
    }


    @Test
    @DisplayName("정상 주문 발행")
    void placeOrder_success(){
        //given
        List<OrderItem> items = List.of(
                new OrderItem("짜장면",2,10000),
                new OrderItem("짬뽕",1,12000)
        );

        //when
        Order order = orderService.placeOrder(items);


        //then
        assertNotNull(order);
        assertEquals(2, order.getItems().size());
        assertEquals(32000, order.totalPrice());
        Assertions.assertThat(order.getCreatedAt()).isNotNull();
        Assertions.assertThat(order.getId()).isPositive();

    }

    @Test
    @DisplayName("검증 실패 ㅣ 비어있는주문")
    void placeOrder_fail_empty(){
        List<OrderItem> emptyItems = List.of();


        //when then
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> orderService.placeOrder(emptyItems)
        );

        assertTrue(ex.getMessage().contains("주문 항목이 비어있습니다"));

    }

    @Test
    @DisplayName("검증 실패 | 수량,가격 위반")
    void placeOrder_fail_rule(){

        List<OrderItem> items = List.of(
                new OrderItem("짜장면",0,10000),
                new OrderItem("짬뽕",1,-1)
        );

        //when then
        Assertions.assertThatThrownBy(
                () -> orderService.placeOrder(items)
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("수량")
                .hasMessageContaining("가격");

    }

}