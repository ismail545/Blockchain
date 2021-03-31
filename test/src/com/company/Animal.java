package com.company;

interface Animal {




    String getColour();

    void setColour(String colour);

    int getLegs();

    default void setLegs(int legs) {
        System.out.println("Default method");
    }

    void makeSound();
}
