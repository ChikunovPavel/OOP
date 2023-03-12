package HomeWork1.child;

import HomeWork1.parent.Animal;

public class Fish extends Animal {
    public Fish(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void speak() {
    }


    @Override
    public void fly() {
    }


    @Override
    public void toGo() {
    }

}
