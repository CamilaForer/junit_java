package org.example;

import org.example.models.Cat;
import org.example.models.Elephant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void printAnimals() {
        Zoo newZoo = new Zoo();
        newZoo.addAnimal(new Cat(123,3,5,10));
        newZoo.addAnimal(new Elephant(1,7,110));
        newZoo.printAnimals();
        Assertions.assertEquals(newZoo.getAnimals().size(),2);
    }
}