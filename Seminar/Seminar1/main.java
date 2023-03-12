package Seminar1;

import Seminar1.child.Cat;
import Seminar1.child.dog;
import Seminar1.child.duck;
import Seminar1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = new Animal(null,null,1);
//        System.out.println(animal.getName());

        Animal animal1 = new Animal("byy");
//        System.out.println(animal1.getPawsCount());
//        System.out.println(animal1.getType());
        Cat cat1 = new Cat("baa");

//        System.out.println(cat1.getName());
//        System.out.println(animal1.getType());
//        System.out.println(cat1.getType());
        Cat cat2 = new Cat("bae");
//        cat1.speak();
//        cat2.speak();
//        animal1.speak();

        List<Animal> animals = new ArrayList<>();
            animals.add(cat2);
            animals.add(new dog("Boooooo"));
            animals.add(new duck("aaaaaaaaaaaaaaa"));
//        animals.forEach(a-> a.speak());
//        animals.forEach(Animal::speak);

//        for (Animal a: animals){
//            System.out.println(a);
//        }

//        for (Animal a: animals) {
//            if(a instanceof duck)((duck) a).fly();
//            System.out.println(a);
//
//        }



    }
}
