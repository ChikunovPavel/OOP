package Seminar1.impl;

import Seminar1.parent.Animal;

public class dog extends Animal {
    public dog(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("gavv");
    }

    @Override
    public void hunt() {

    }
}
