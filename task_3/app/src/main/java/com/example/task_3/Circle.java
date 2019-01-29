package com.example.task_3;

public class Circle implements Shape {
    public static int d;

    public Circle(int d){
        this.d = d;
    }

    public void perimeter(){
        double p = 0;
        p = 3.14*d;
        System.out.println("Периметр круга: " + p);
    }

    public void area(){
        double s = 0;
        s = 3.14*(d/2)*(d/2);
        System.out.println("Площадь круга: " + s);
    }

}
