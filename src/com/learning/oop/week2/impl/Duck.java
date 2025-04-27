package com.learning.oop.week2.impl;

import com.learning.oop.week2.interfaces.Flyable;
import com.learning.oop.week2.interfaces.Swimmable;

public class Duck implements Flyable , Swimmable {
    @Override
    public void takeOff() {
        System.out.println("Duck is taking off");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void land() {
        System.out.println("Duck is landing");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
