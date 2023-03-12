package Seminar1;


public class Cat extends Animal {
    public Cat(String name, String color, int pawsCount) {
        super(name, color, pawsCount);
    }

    public Cat(String name) {
        super(name);
    }

    public  void hunt(){
        wakeUp();
        findFood();
        eat();
    }
    private void wakeUp(){
        System.out.println("Cat wakeUp");
    }private void findFood(){
        System.out.println("Cat findFood");
    }private void eat(){
        System.out.println("Cat eat");
    }public void goToSleep() {
        System.out.println("Cat goToSleep");
    }
    @Override
    public void speak() {
        System.out.println("myu");
    }
}

