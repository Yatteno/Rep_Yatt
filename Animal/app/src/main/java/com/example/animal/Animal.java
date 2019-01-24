
package com.example.animal;

import java.util.Scanner;

public abstract class Animal {
    protected String name;
    private boolean isPet = true;
    static int counter;

    Animal() {
        counter++;
    }

    public String getName() {
        if (name == null)
            return "Nameless Animal";
        else
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Animal(String name) {
        this.name = name;
        System.out.println("Кличка:" + getName());
        counter++;
    }

    public Animal(boolean isPet) {
        this.isPet = isPet;

    }

    public abstract void eat();

    public abstract void walk();

}


