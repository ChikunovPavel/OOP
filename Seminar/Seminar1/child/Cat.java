package Seminar1.child;


import Seminar1.parent.Animal;

public class Cat extends Animal {
    public Cat(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Cat(String name) {
        super(name);
    }




    @Override
    public void speak() {
        System.out.println("myu");
    }
}

