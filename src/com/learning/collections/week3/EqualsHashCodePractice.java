package com.learning.collections.week3;

import com.learning.collections.week3.model.Student;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodePractice {
    public static void main(String[] args) {
        System.out.println("---Step 1:Testing HashSet without overriding equals and hashCode---");

        Set<Student> studentSet1 = new HashSet<>();
        Student s1_1 = new Student("S001", "Alice", 20);
        Student s1_2 = new Student("S001", "Alice", 20);
        System.out.println("s1_1 == s1_2 ? " + (s1_1 == s1_2)); // false (地址不同)

        System.out.println("s1_1.equals(s1_2) ? " + (s1_1.equals(s1_2))); // false
        System.out.println("s1_1.hashCode(): " + s1_1.hashCode()); // 123456789
        System.out.println("s1_2.hashCode(): " + s1_2.hashCode()); // 987654321

        studentSet1.add(s1_1);
        boolean added_s1_2 = studentSet1.add(s1_2); // false
        System.out.println("\nAdding s1_1 and s1_2 to HashSet: "); // false
        System.out.println("Was s1_2 added?" + added_s1_2);
        System.out.println("Set size: "+studentSet1.size());
        System.out.println("Set contents: "+studentSet1); // [Student{studentId='S001', name='Alice', age=20}]

        //测试contains
        Student s1_3 = new Student("S001", "Alice", 20);
        System.out.println("\nChecking contains(s1_3):");
        System.out.println("s1_3.hashCode(): " + s1_3.hashCode()); // 123456789
        System.out.println("Set contains s1_3? " + studentSet1.contains(s1_3)); // false
        System.out.println("--------------------------------");

        System.out.println("---Step 2:Testing HashSet with overridden equals and hashCode---");
        Set<Student> studentSet2 = new HashSet<>();

        Student s2_1 = new Student("S202", "Bob", 21);
        Student s2_2 = new Student("S202", "Bob", 21);

        System.out.println("s2_1.equals(s2_2) ? " + (s2_1.equals(s2_2))); // true
        System.out.println("s2_1.hashCode(): " + s2_1.hashCode());
        System.out.println("s2_2.hashCode(): " + s2_2.hashCode());

        studentSet2.add(s2_1);
        boolean added_s2_2 = studentSet2.add(s2_2);
        System.out.println("\nAdding s2_1 and s2_2 to HashSet (only equals overridden): ");
        System.out.println("Was s2_2 added?"+added_s2_2);
        System.out.println("Set size: "+studentSet2.size());
        System.out.println("Set contents: "+studentSet2); // [Student{studentId='S202', name='Bob', age=21}]
        System.out.println("**Reason:** Although equals() is true, their hashCodes (from Object) are likely different. HashSet uses hashCode first to find the bucket. Since hashCodes differ, it doesn't even bother calling equals() in this case, and treats them as different objects in different buckets (or no collision).");

        Student s2_3 =  new Student("S202", "Bob", 21);
        System.out.println("\nChecking contains(s2_3):");
        System.out.println("s2_3.hashCode(): " + s2_3.hashCode());
        System.out.println("Set contains s2_3? " + studentSet2.contains(s2_3)); // false
        System.out.println("**Reason:** HashSet uses hashCode first to find the bucket. Since hashCodes differ, it doesn't even bother calling equals() in this case, and treats them as different objects in different buckets (or no collision).");
        System.out.println("--------------------------------");

        System.out.println("---Step 3 & 4:Testing HashSet with overridden equals and hashCode---");

        Set<Student> studentSet3 = new HashSet<>();

        Student s3_1 = new Student("S303", "Charlie", 22);
        Student s3_2 = new Student("S303", "Charlie", 22);

        Student s3_4 = new Student("S304", "David", 22);
        Student s3_5 = new Student("S305", "Eve", 23);

        System.out.println("s3_1.equals(s3_2) ? " + (s3_1.equals(s3_2))); // true
        System.out.println("s3_1.hashCode(): " + s3_1.hashCode());
        System.out.println("s3_2.hashCode(): " + s3_2.hashCode());
        System.out.println("s3_4.hashCode(): " + s3_4.hashCode());
        System.out.println("s3_5.hashCode(): " + s3_5.hashCode());

        studentSet3.add(s3_1);
        boolean added_s3_2 = studentSet3.add(s3_2);
        System.out.println("\nAdding s3_1 and s3_2 to HashSet (equals and hashCode overridden): ");
        System.out.println("Was s3_2 added?"+added_s3_2);
        System.out.println("Set size: "+studentSet3.size());
        System.out.println("Set contents: "+studentSet3); // [Student{studentId='S303', name='Charlie', age=22}]
        System.out.println("**Reason:** HashSet uses hashCode first to find the bucket. Since hashCodes are the same, it calls equals() to check for equality. Since equals() returns true, it doesn't add s3_2 again.");

        System.out.println("\nAdding s3_4 and s3_5 to HashSet: ");
        boolean added_s3_4 = studentSet3.add(s3_4);
        System.out.println("Was s3_4 added?"+added_s3_4);
        System.out.println("Set size: "+studentSet3.size());

        boolean added_s3_5 = studentSet3.add(s3_5);
        System.out.println("Was s3_5 added?"+added_s3_5);
        System.out.println("Set size: "+studentSet3.size());
        System.out.println("Set contents: "+studentSet3); // [Student{studentId='S303', name='Charlie', age=22}, Student{studentId='S304', name='David', age=22}, Student{studentId='S305', name='Eve', age=23}]
        System.out.println("---------------------------");


    }

}
