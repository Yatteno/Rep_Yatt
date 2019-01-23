package com.example.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat(boolean isPet) {
        super(isPet);
    }

    @Override
    public String getName() {
        if (name == null)
            return "Nameless Cat";
        else
            return name;
    }

    public void eat( String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
