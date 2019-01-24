package com.example.animal;

class Dog extends Animal implements Pet {

    Dog(String name) {

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
        System.out.println(getName() + " is grateful");
    }

    public void walk(){
        System.out.println(getName() + " is walking");
    }

    public void print(){
        System.out.println(getName() + " is Pet");
    }
}
