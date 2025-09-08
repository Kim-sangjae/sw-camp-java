package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
//        a.testSimpleIfStatement();
//        a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
//        b.testSimpleIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
//        c.testIfElseIfStatement();
//        c.testNestedIfElseIfStatement();
//        c.testImproveIfElseIfStatement();

        D_switch d = new D_switch();
//        d.testSimpleSwitchStatement();
        d.improveSwitchStatement();
    }
}
