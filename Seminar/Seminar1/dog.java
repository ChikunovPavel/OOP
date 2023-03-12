package Seminar1;

public class dog extends Animal {
    public dog(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("gavv");
    }
}
