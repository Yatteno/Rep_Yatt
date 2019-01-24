package com.example.animal;

class Cat extends Animal implements Pet{

    Cat(String name) {
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

    public void eat() {
        System.out.println(getName() + " is eating");
    }

    public void walk(){
        System.out.println(getName() + " is walking");
    }

    public void print(){
        System.out.println(getName() + " is Pet");
    }
}
