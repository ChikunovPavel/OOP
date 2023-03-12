package Seminar1.child;

import Seminar1.parent.Animal;

public class Bird extends Animal {
    public Bird(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Bird(String name) {
        super(name);
    }
}
