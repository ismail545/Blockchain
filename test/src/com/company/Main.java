package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("hEY BRO ");

        Animal dog1 = new Dog("German Shepard", "Brown", 4);

        System.out.println(dog1.getColour());
        dog1.setLegs(4);
        dog1.makeSound();
    }
}
