package Seminar1.impl;

import Seminar1.parent.Animal;

public class Bird extends Animal {
    public Bird(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }
}
