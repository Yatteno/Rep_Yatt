package com.example.task_3;

class Rectangle implements Shape {
    public static int a;
    public static int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void perimeter(){
        int p = 0;
        p = (a + b)*2;
        System.out.println("Периметр прямоугольника: " + p);
    }

    public void area(){
        int s = 0;
        s = a*b;
        System.out.println("Площадь прямоугольника: " + s);
    }
}
