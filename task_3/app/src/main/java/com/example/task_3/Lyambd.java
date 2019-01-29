package com.example.task_3;

public class Lyambd {

    public static void main(String[] args) {

        Printable myClosure = s -> System.out.println(s);

        repeatTask(10, myClosure);
    }

    public static void repeatTask(int times, Printable myClosure){
        for(int i = 0; i < times; i++)
            myClosure.print("I love Java!");
    }

}

interface Printable{
    void print(String s);
}