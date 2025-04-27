package com.learning.oop.week2.inheritance;

public class Cat extends Animal {
    private boolean likeLasePointer; // Cat specific attribute
    public Cat(String name, int age, boolean likeLasePointer) {
        super(name, age); // Call the parent class constructor
        System.out.println("Cat constructor called for:" + name);
        this.likeLasePointer = likeLasePointer;
    }

    //cat specific method
    public void scratch() {
        System.out.println(name + " is scratching.");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " (a cat) meows.");
    }

    public boolean isLikeLaserPointer() {
        return likeLasePointer;
    }
}
