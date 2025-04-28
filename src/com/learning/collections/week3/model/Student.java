package com.learning.collections.week3.model;
import java.util.Objects;

public class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getStudentId(){
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // --- toString for readable output ---
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // --- equals method ---
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check null and class type
        Student student = (Student) obj; // Cast to Student
        return Objects.equals(studentId, student.studentId);
    }

    // --- hashCode method ---
    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
