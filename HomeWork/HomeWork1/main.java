package HomeWork1;

import HomeWork1.child.*;
import HomeWork1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal(null,null,1);



        List<Animal> animals = new ArrayList<>();
            animals.add(new Bird("Кеша"));
            animals.add(new Cat("Бу"));
            animals.add(new dog("Рекс"));
            animals.add(new duck("Скрудж"));
            animals.add(new Fish("Немо"));
            animals.add(new Shark("Дипломат"));

//        System.out.println(animals.getFirst());
//        System.out.println(animal);

        for (Animal a: animals) {
            System.out.print(a);
            a.steps();
            System.out.println();

        }
    }


}








