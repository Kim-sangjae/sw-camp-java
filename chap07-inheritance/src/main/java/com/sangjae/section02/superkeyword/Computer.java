package com.sangjae.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price, Date menufaturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, menufaturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }


    @Override
    public String getInformation(){

        return super.getInformation()
                + " " + cpu + " " + hdd + " " + ram + " " + operationSystem;
    }


    public String getCpu() {

        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
}
