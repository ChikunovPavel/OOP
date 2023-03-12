package HomeWork1.parent;

public class Animal {
    private String name;
    private String color;
    private int pawsCount;


//    public String getType(){
//        return this.getClass().getSimpleName();
//    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPawsCount() {
        return pawsCount;
    }
    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }



    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
    }
    public Animal(String name){
        this(name,null,0);
    }



    private void wakeUp() {
        System.out.println("проснулся");
    }public void toGo(){
        System.out.println("пошел");
    }public void fly(){
        System.out.println("полетел");
    }public void swin() {
        System.out.println("поплыл");
    }
    private void findFood(){
        System.out.println("нашел еду");
    }private void eat(){
        System.out.println("поел");
    }private void goToSleep() {
        System.out.println("отправился спать");
    }
    public void speak(){
        System.out.println("поговорил");
    }



    public void steps(){

        wakeUp();
        speak();
        toGo();
        fly();
        swin();
        findFood();
        eat();
        goToSleep();
    }







    @Override
    public String toString() {
        return String.format("имя: %s ," + " цвет: %s\n",this.name, this.color);
    }
}



