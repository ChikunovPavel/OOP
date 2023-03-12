package Seminar1.child;

import Seminar1.parent.Animal;

public class duck extends Animal {
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


}
