package com.greedy.level02.nomal;

import java.util.Random;

public class RandomMaker {

    Random rd = new Random();

    int randomNumber(int min , int max){

        return rd.nextInt(max)+min;
    }

    // ////
    String randomUpperAlphabet(int length){

        String upperString = "";

        for(int i = 0; i<length; i++){
            int randomChar = rd.nextInt(26)+65;
            char r = (char)randomChar;
            upperString = upperString.concat(String.valueOf(r));
        };

        return upperString;
    }

    // ///
    String rockPaperScissors(){
        int random = rd.nextInt(3);
        String rsp;
        if(random == 0){
            rsp = "가위";
        } else if(random == 1){
            rsp = "바위";
        } else {
            rsp = "보";
        }

        return rsp;
    }



    // ///
    String tossCoin(){
        String ci;
        int check = rd.nextInt(2);

        ci = check == 0 ? "앞면" : "뒷면";

        return ci;

    }

}
