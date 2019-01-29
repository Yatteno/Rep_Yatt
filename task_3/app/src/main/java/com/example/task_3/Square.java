package com.example.task_3;

public class Square implements Shape {
    public static int a;

    public Square(int a){
        this.a = a;
    }
    public void perimeter(){
        int p = 0;
        p = a*4;
        System.out.println("Периметр квадрата: " + p);
    }

    public void area(){
        int s = 0;
        s = a*a;
        System.out.println("Площадь квадрата: " + s);
    }
}
