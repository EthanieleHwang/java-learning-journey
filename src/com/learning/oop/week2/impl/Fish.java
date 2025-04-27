package com.learning.oop.week2.impl;

import com.learning.oop.week2.inheritance.Animal;
import com.learning.oop.week2.interfaces.Swimmable;

public class Fish implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
