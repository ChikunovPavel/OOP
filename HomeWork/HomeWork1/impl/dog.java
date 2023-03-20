package HomeWork1.impl;

import HomeWork1.parent.Animal;

public class dog extends Animal {
    public dog(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("гав-гав");
    }

    @Override
    public void fly() {
    }


    @Override
    public void swin() {
    }

}
