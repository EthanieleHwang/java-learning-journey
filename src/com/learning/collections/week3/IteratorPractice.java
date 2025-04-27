package com.learning.collections.week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        System.out.println("--- Iterator Practice ---");

        //1.iterate over ArrayList by using for Iterator
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Banana");

        System.out.println("\nIterating ArrayList using Iterator:");
        Iterator<String> fruitIterator = fruits.iterator();
        while(fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            if("Banana".equals(fruit)) {
                fruitIterator.remove(); // remove the current element
                System.out.println("Remove a Banana");
            }
        }
        System.out.println("Fruits after removing Banana: " + fruits);

        //3.演示Iterator同样适用于LinkedList
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("\nIterating LinkedList and removing odd numbers:");
        Iterator<Integer> numberIterator = numbers.iterator();
        while(numberIterator.hasNext()) {
            int number = numberIterator.next();
            if(number % 2 != 0) { // check if the number is odd
                numberIterator.remove(); // remove the current element
                System.out.println("Remove odd number: " + number);
            }
        }
        System.out.println("Numbers after removing odd numbers: " + numbers);

        //4.触发ConcurrentModificationException
        System.out.println("\nAttempting to remove during for-each(will cause error):");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Violet");
        try{
            for(String color : colors) {
                if("Green".equals(color)) {
                    colors.remove(color); // this will cause ConcurrentModificationException
                }
            }
        }catch(java.util.ConcurrentModificationException e){
            System.out.println("Caught expected ConcurrentModificationException: " + e.getMessage());
        }
        System.out.println(colors.getClass());
        System.out.println("Colors list state might be unpredictable: " + colors);

        System.out.println("--------------------------");
    }
}
