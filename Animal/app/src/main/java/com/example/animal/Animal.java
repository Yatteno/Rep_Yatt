
package com.example.animal;

import java.util.Scanner;

public class Animal {
    protected String name;
    private boolean isPet = true;
    static int counter;


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
        System.out.println("Количество животных: " + counter);

    }

    public Animal(boolean isPet) {
        this.isPet = isPet;

    }

    public void eat() {
        System.out.println(getName() + " is eating");
    }

}


