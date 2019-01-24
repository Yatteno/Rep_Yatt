package com.example.animal;

class Lion extends Animal {

    Lion(String name) {
        super(name);
    }

    public void eat(){
        System.out.println(getName() + " is eating");
    }

    public void walk(){
        System.out.println(getName() + " is walking");
    }

}
