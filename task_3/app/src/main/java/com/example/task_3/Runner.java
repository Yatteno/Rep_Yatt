package com.example.task_3;

public class Runner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Square k = new Square(10);
        Circle c = new Circle(7);
        r.perimeter();
        r.area();
        k.perimeter();
        k.area();
        c.perimeter();
        c.area();
    }
}

