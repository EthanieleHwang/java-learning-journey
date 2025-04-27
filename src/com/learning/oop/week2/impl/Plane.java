package com.learning.oop.week2.impl;

import com.learning.oop.week2.interfaces.Flyable;

public class Plane implements Flyable {

    @Override
    public void takeOff() {
        System.out.println("Plane accelerates on runway and takes off.");
    }

    @Override
    public void fly() {
        System.out.println("Plane flies at high altitude using engines.");
    }

    @Override
    public void land() {
        System.out.println("Plane aligns with runway and lands.");

    }
}
