package Seminar1.impl;


import Seminar1.Illable;

import Seminar1.parent.Animal;

import java.io.Serializable;

public class Cat extends Animal implements Illable, Serializable {
    public Cat(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void hunt() {

    }

    @Override
    public void speak() {
        System.out.println("myu");
    }

//    @Override
    public void getIll() {
        System.out.printf("%s заболел %n",getType());
    }
}

