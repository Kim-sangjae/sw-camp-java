package com.sangjae.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car(){
        System.out.println("Car 클래스 생성자 호출");
    }

    public void setRunningStatus(Boolean f){
        this.runningStatus = f;
    }

    public void run(){
        runningStatus = true;
        System.out.println("차가 달립니다");
    }


    public void stop(){
        runningStatus = false;
        System.out.println("차가 멈춥니다");
    }

    protected boolean isRunning(){
        return runningStatus;
    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵빵!");
        }else{
            System.out.println("주행중이 아닐때는 경적을 울리지 못합니다");
        };

    }
}
