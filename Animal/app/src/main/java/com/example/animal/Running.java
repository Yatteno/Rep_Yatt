package com.example.animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Running {
    public static void main(String[] args) {

        String n1, n3;
        Scanner in = new Scanner(System.in);
        n1 = in.next();
        n3 = in.next();

        Animal name = new Animal(n1);
        //name.setName(n1);
        //System.out.println(name.getName() + " is created");
        name.eat();


        Animal name2 = new Animal(n3);
        //name.setName(n3);
        //System.out.println(name.getName() + " is created");
        name2.eat();

        Animal ispet = new Animal(true);
        ispet.eat();

        Parrot p = new Parrot("Kesha");
        Parrot p1 = new Parrot(true);
        Cat k = new Cat("Vasya");
        Cat k1 = new Cat(false);
        Dog d = new Dog("Bob");
        Dog d1 = new Dog(true);

        ArrayList<Animal> animList = new ArrayList<Animal>();
        animList.add(p);
        animList.add(p1);
        animList.add(d);
        animList.add(d1);
        animList.add(k);
        animList.add(k1);

        for(Animal animal: animList){
            animal.eat();
        }
    }
}
