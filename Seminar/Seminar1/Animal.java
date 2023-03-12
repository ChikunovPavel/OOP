package Seminar1;

public class Animal {
    private String name;
    private String color;

    private int pawsCount;

    public String getType(){
        return this.getClass().getSimpleName();
    }

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

    public Animal (String name){
        this(name,null,0);
    }




    public void speak(){
        System.out.println("zzzzzzzzzzzzzzzz");
    }

    @Override
    public String toString() {
        return String.format("имя: %s ," + " цвет: %s \n ",this.name, this.color);
    }
}



