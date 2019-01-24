package com.example.animal;

class RoboDog extends Animal implements Pet, Robot{

    RoboDog(String name) {
        super(name);
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

    public void printl(){
        System.out.println(getName() + " is Robot");
    }
}
