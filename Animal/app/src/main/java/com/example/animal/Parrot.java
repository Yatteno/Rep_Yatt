package com.example.animal;

class Parrot extends Animal implements Pet{


    Parrot(String name) {
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

    public void eat(){
        System.out.println(getName() + " is eating");
    }

    public void walk(){
        System.out.println(getName() + " is walking");
    }

    public void print(){
        System.out.println(getName() + " is Pet");
    }
}