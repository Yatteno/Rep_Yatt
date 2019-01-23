package com.example.animal;

public class Parrot extends Animal {


    public Parrot(String name) {
        super(name);
        System.out.println(getName() + " is flying");
    }

    public Parrot(boolean isPet) {
        super(isPet);
    }

    @Override
    public String getName() {
        if (name == null)
            return "Nameless Parrot";
        else
            return name;
    }
}