package org.example.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat newCat;


    @BeforeEach
    void setUp() {
        newCat = new Cat(123,2,4);
        System.out.println(newCat);
    }

    @Test
    void sound() {
        Assertions.assertEquals(newCat.sound(),"Miauu");
    }

    @Test
    void move() {
    }


    @Test
    void jump() {
        Assertions.assertEquals(newCat.jump(),"Salto");
    }
}