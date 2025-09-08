package com.greedy.level02.nomal;

public class Application {
    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();

        System.out.println(rm.randomNumber(1,8));
        System.out.println(rm.randomUpperAlphabet(9));
        System.out.println(rm.rockPaperScissors());
        System.out.println(rm.tossCoin());


    }
}
