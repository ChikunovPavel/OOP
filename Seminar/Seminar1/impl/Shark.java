package Seminar1.impl;

import Seminar1.parent.Animal;

public class Shark extends Animal {

    public Shark(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Shark(String name) {
        super(name);
    }

    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }
}
