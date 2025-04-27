package com.learning.collections.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        System.out.println("---ArrayList Deep Dive---");

        //1.Specify the initial capacity when creating (recommended).
        List<Integer> numbers = new ArrayList<>(20); //预估可能需要20个元素

        //2. Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(0,5);
        System.out.println("Numbers:"+numbers);

        //3. accessing elements
        System.out.println("Element at index 2:"+numbers.get(2)); // 20

        //4. modifying elements
        numbers.set(1,15); // set index 1 to 15
        System.out.println("Numbers after modification:"+numbers);

        //5. removing elements
        numbers.remove(2);
        System.out.println("Numbers after removing index 2:"+numbers);

        //6.demonstrating the difference between remove(Object) and remove(int index)
        List<Integer> scores = new ArrayList<>(Arrays.asList(100,80,90,80));
        System.out.println("Initial scores:"+scores);
        scores.remove(Integer.valueOf(80)); // remove the first occurrence of 80
        System.out.println("Scores after removing value 80:"+scores);
        scores.remove(1); // remove the element at index 1
        System.out.println("Scores after removing index 1:"+scores);

        System.out.println("------------------------------");
        //8. Iterating through the list
        System.out.println("Iterating through the list:");
        // Using for-each loop
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Using for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i)+";");

        }
        System.out.println("------------------------------");
    }
}
