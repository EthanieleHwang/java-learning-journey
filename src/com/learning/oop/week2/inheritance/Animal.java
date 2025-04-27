package com.learning.oop.week2.inheritance;

public class Animal {
    protected String name; //used protected to allow access in subclasses
    protected int age;

    public Animal(String name, int age) {
        System.out.println("Animal constructor called for:"+name);
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    //final method cannot be overridden
    public final void breathe() {
        System.out.println(name + " is breathing.");
    }

    public String getName() {
            return name;
    }

    public int getAge() {
        return age;
    }
}
