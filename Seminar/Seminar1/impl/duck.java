package Seminar1.impl;

import Seminar1.Flyable;
import Seminar1.Illable;
import Seminar1.parent.Animal;

public class duck extends Animal implements Flyable, Illable {
    public duck(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("craa");
    }

    public void fly(){
        System.out.println("полетели");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlyghtSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
}
