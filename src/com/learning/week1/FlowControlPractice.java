package com.learning.week1;

public class FlowControlPractice {
    public static void main(String[] args) {
        System.out.println("--- If Statements Practice ---");
        int score=75;

        //Simple if
        if (score >= 60){
            System.out.println("Congratulations,you passed!");
        }

        //if-else
        int number =-5;
        if(number > 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is not postive(zero or negative).");
        }

        //if-else if-else (Grade example)
        char grade;
        if(score >= 90){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if(score >= 70){
            grade = 'C';
        }else if(score >= 60){
            grade = 'D';
        }else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);
        System.out.println();
    }

}
