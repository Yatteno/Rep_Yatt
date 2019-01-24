package com.example.animal;

import java.util.ArrayList;
//import java.util.Scanner;

public class Running {
    public static void main(String[] args) {


       // Animal ispet = new Animal(true);
        //ispet.eat();

        Parrot p = new Parrot("Kesha");
        Parrot p1 = new Parrot(true);
        Cat k = new Cat("Vasya");
        Cat k1 = new Cat(false);
        Dog d = new Dog("Bob");
        Dog d1 = new Dog(true);
        RoboDog r = new RoboDog("Jon");


        ArrayList<Animal> animList = new ArrayList<Animal>();
        animList.add(p);
        animList.add(p1);
        animList.add(d);
        animList.add(d1);
        animList.add(k);
        animList.add(k1);
        animList.add(r);

        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(r);

        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(p);
        pets.add(p1);
        pets.add(d);
        pets.add(d1);
        pets.add(k);
        pets.add(k1);
        pets.add(r);

        for(Animal animal: animList){
            animal.eat();
        }

        for(Animal animal: animList){
            animal.walk();
        }

        for(Robot robot: robots){
            robot.printl();
        }

        for(Pet pet: pets){
            pet.print();
        }

        System.out.println("Создано объектов: " + Animal.counter);
    }
}
