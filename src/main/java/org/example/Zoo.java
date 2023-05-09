package org.example;

import org.example.models.Animal;
import org.example.models.Cat;
import org.example.models.Elephant;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void printAnimals (){
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
