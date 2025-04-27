package com.learning.oop.week2.impl;

import com.learning.oop.week2.inheritance.Animal;
import com.learning.oop.week2.interfaces.Flyable;

public class Bird implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("Bird is taking off");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing");
    }
}
