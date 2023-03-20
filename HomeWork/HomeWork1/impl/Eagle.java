package HomeWork1.impl;

import Seminar1.Flyable;
import Seminar1.Illable;
import Seminar1.parent.Animal;

public class Eagle extends Animal implements Flyable, Illable {


    public Eagle(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Eagle(String name) {
        super(name);
    }

    @Override
    public int getFlyghtSpeed() {
        return 100;
    }

    @Override
    public void getIll() {

    }

    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }
}
