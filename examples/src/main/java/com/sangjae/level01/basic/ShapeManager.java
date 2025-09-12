package com.sangjae.level01.basic;

import java.util.Arrays;

public class ShapeManager {

    private Shape[] shapes = new Shape[10];
    private int index;

    public void addShape(Shape shape) {
        boolean check = false;

        // 빈 자리 찾기
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                shapes[i] = shape;
                check = true;
                break;
            }
        }

        // 배열이 꽉 찼으면 2배로 늘리고 추가
        if (!check) {
            Shape[] newShapes = new Shape[shapes.length * 2];
            for (int i = 0; i < shapes.length; i++) {
                newShapes[i] = shapes[i];
            }
            newShapes[shapes.length] = shape; // 새 도형 추가
            shapes = newShapes; // 배열 교체
        }


    }

    public void removeShape(Shape shape) {

        int length = shapes.length;
        for (int i = 0; i < length; i++) {

            if (shapes[i] == shape) {
                shapes[i] = null;

                for (int j = i; j < length-1; j++) {
                    shapes[j] = shapes[j + 1];
                }

                shapes[length - 1] = null;

            }//if

        }//for1
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for (Shape shape : shapes) {
            if(shape!=null){
                System.out.println("Shape : " + shape.getClass().getSimpleName());
                System.out.println("Area : " + shape.calculateArea());
                System.out.println("Perimeter : " + shape.calculatePerimeter());
            }
        }

    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sumArea = 0;
        for (Shape shape : shapes) {
            if(shape!=null){
                sumArea += shape.calculateArea();
            }
        }
        return sumArea;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sumPer = 0;
        for (Shape shape : shapes) {
            if(shape!=null){
                sumPer += shape.calculatePerimeter();
            }
        }
        return  sumPer;
    }

}
