package org.example.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElephantTest {

    Elephant newElephant;

    @BeforeEach
    void setUp() {
        newElephant = new Elephant(21,10,125);
    }

    @Test
    void take() {
        Assertions.assertEquals(newElephant.take(),"Aguita");

    }

    @Test
    void sound() {
        Assertions.assertEquals(newElephant.sound(),"fffff");

    }
}