package com.company;

public class Dog implements Animal{

    private String Breed;
    private String colour;
    private int legs;


    public Dog(String Breed, String colour, int legs) {
        this.Breed = Breed;
        this.colour = colour;
        this. legs = legs;
    }



    public String getColour() {
        return this.colour;
    }


    public void setColour(String colour) {

    }


    public int getLegs() {
        return legs;
    }



    public void makeSound() {
        System.out.println("WOOF");

    }

    @Override
    public void setLegs(int legs) {
        System.out.println("hi");
    }

    public int addLeg(int x){
        legs += x;
        return legs;
    }


}





