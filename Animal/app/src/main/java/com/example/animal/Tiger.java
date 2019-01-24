package com.example.animal;

class Tiger extends Animal {

    Tiger(String name) {
        super(name);
    }

    public void eat(){
        System.out.println(getName() + " is eating");
    }

    public void walk(){
        System.out.println(getName() + " is walking");
    }
}
