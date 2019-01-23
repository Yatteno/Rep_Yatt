package com.example.animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        if (name == null)
            return "Nameless Dog";
        else
            return name;
    }

    public Dog(boolean isPet) {
        super(isPet);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " is grateful");
    }
}
