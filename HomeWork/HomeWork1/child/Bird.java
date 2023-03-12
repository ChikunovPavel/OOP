package HomeWork1.child;

import HomeWork1.parent.Animal;

public class Bird extends Animal {
    public Bird(String name, String color, int pawsCount) {
        super(name,color,pawsCount);
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Кар-кар");
    }

//    @Override
//    public void toGo() {
//        System.out.println();
//    }

    @Override
    public void swin() {
    }

}




