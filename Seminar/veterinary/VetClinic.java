package veterinary;

import Seminar1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;
    public VetClinic() {
        this.animals = new ArrayList<>();
    }
    public List<Animal> getAnimals(){
        return  animals;
    }

    public VetClinic addAnimal(Animal animal){
        this.animals.add(animal);
        return this;
    }
}



