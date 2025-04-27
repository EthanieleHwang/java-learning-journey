package com.learning.oop.week2.inheritance;

public class Dog extends Animal {
    private String breed; // Dog breed

    //child class constructor
    public Dog(String name,int age,String breed) {
        super(name, age); // Call the parent class constructor
        System.out.println("Dog constructor called for:"+name);
        this.breed = breed;
    }

    //Dog specific method
    public void bark() {
        System.out.println(name + " (a "+ breed + ") says: Woof Woof!!");
    }

    //Override the makeSound method from Animal class
    @Override
    public void makeSound() {
        System.out.println(name + " (a "+ breed + ") barks.");
    }

    @Override
    public void move(){
        System.out.println(name+"is running on four legs.");
    }
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
        super.eat();
    }

    public String getBreed() {
        return breed;
    }
}
