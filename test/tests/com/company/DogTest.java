package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void setLegs() {
    }

    @Test
    void getColour() {
    }

    @Test
    void setColour() {
    }

    @Test
    void getLegs() {
    }

    @Test
    void makeSound() {
    }

    @Test
    void testSetLegs() {
    }

    @Test
    void addLeg() {
        Dog husky = new Dog("Husky", "White", 4);
        int actualOutput = husky.addLeg(1);
        assertEquals(5, actualOutput);
    }
}