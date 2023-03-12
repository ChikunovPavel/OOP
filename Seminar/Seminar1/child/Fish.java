package Seminar1.child;

import Seminar1.parent.Animal;

public class Fish extends Animal {
    public Fish(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Fish(String name) {
        super(name);
    }
}
