package com.learning.collections.week3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        System.out.println("---HashSet Practice ---");

        //1.create HashSet (use Set interface reference)
        Set<String> languages = new HashSet<>();

        //2.add elements-return boolean display if added successfully
        System.out.println("Adding Java: " + languages.add("Java")); // true
        System.out.println("Adding Python: " + languages.add("Python")); // true
        System.out.println("Adding C++: " + languages.add("C++")); // true
        System.out.println("Adding Java again: " + languages.add("Java")); // false
        System.out.println("Adding null: " + languages.add(null)); // true
        System.out.println("Adding null again: " + languages.add(null)); // false

        System.out.println("Languages Set: " + languages);
        System.out.println("Size: " + languages.size()); // 4

        //3. check if an element exists
        System.out.println("\nChecking contains:");
        System.out.println("Contains 'Python': " + languages.contains("Python")); // true
        System.out.println("Contains 'Go': " + languages.contains("Go")); // false
        System.out.println("Contains null: " + languages.contains(null)); // true

        //4. remove an element
        System.out.println("\nRemoving elements:");
        System.out.println("Removing 'C++': " + languages.remove("C++")); // true
        System.out.println("Removing null: " + languages.remove(null)); // true
        System.out.println("Removing 'Go': " + languages.remove("Go")); // false
        System.out.println("Languages Set after removals: " + languages); // [Java, Python]

        //5.遍历Set
        // Using for-each loop
        System.out.println("\nIterating through the Set:");
        for(String lang: languages) {
            System.out.println("- "+lang);
        }

        // Using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = languages.iterator();
        while(it.hasNext()) {
            String lang = it.next();
            System.out.println("* "+lang);
            if("Java".equals(lang)) {
                it.remove(); // remove Java
                System.out.println("Removed Java");
            }
        }

        //6. check if the set is empty
        System.out.println("\nOther operations");
        System.out.println("Is the set empty? " + languages.isEmpty()); // false;
        languages.clear();
        System.out.println("Set after clear: " + languages); // []
        System.out.println("Is empty now? " + languages.isEmpty()); // true

        System.out.println("----------------");
    }
}
