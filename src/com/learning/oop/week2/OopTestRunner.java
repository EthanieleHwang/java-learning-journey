package com.learning.oop.week2;

import com.learning.oop.week2.impl.*;
import com.learning.oop.week2.inheritance.Animal;
import com.learning.oop.week2.inheritance.Cat;
import com.learning.oop.week2.inheritance.Dog;
import com.learning.oop.week2.interfaces.Flyable;
import com.learning.oop.week2.interfaces.Swimmable;
import org.w3c.dom.ls.LSOutput;

public class OopTestRunner {
    public static void main(String[] args) {
        System.out.println("Staring OOP Test Runner");
        System.out.println("Total accounts created so far:"+ BankAccount.getAccountCounter());//static method
        BankAccount account1 = new BankAccount("John Doe", 1000);
        BankAccount account2 = new BankAccount("Jane Doe", 1000);
        BankAccount invalidAccount = new BankAccount("", -500); //

        System.out.println("Total accounts created so far:"+BankAccount.getAccountCounter());// Invalid account creation

        account1.displayAccountInfo();
        account2.displayAccountInfo();
        invalidAccount.displayAccountInfo();

        System.out.println("\n--- Performing operations on account1 ---");
        System.out.println("Account 1 Number (read-only):+account1.getAccountNumber()");

        account1.deposit(200.0);
        account1.withdraw(50.0);
        account1.withdraw(2000.0); // Attempt to withdraw more than balance
        account1.deposit(-10.0); // Attempt to deposit negative amount

        account1.setOwnerName("John Doe");

        System.out.println("Account 1 Owner Name (read-only): "+account1.getOwnerName());

        account1.setActive(false); // Deactivate account
        account1.deposit(200.0); // Attempt to deposit into inactive account

        System.out.println("\nFinal state of account1:");
        account1.displayAccountInfo();

        System.out.println("\nOOP tests finished");

        System.out.println("--- Testing inheritance ---");

        Dog dog1=new Dog("Buddy", 3, "Golden Retriever");
        Cat cat1=new Cat("Whiskers", 2, true);

        // call from parent class
        System.out.println("\nTesting inheried methods:");
        dog1.eat();
        cat1.sleep();
        dog1.breathe(); //call from final method

        // call from child class
        System.out.println("\nTesting child class specific methods:");
        dog1.bark();
        cat1.scratch();

        // call from overridden method
        System.out.println("\nTesting overridden methods:");
        dog1.makeSound(); //
        cat1.makeSound(); //

        // call from parent class
        System.out.println("\nTesting parent class methods:");
        dog1.fetch();

        System.out.println("\nInheritance tests finished");


        System.out.println("\n--- Testing polymorphism ---");

        //1.Upcasting
        Animal myDogAnimal = new Dog("Rex", 4, "Labrador");
        Animal myCatAnimal = new Cat("Mittens", 2, true);

        //2.Parent class reference
        System.out.println("Calling methods via Animal reference:");
        myDogAnimal.eat(); //Calls Animal's eat method
        myCatAnimal.sleep(); //Calls Animal's sleep method

        //3.
        System.out.println("Calling overridden methods via Animal reference:");
        myDogAnimal.makeSound(); //Executes Dog's makeSound method
        myCatAnimal.makeSound(); //Executes Cat's makeSound method

        System.out.println("---------------------------------------------------------");

        System.out.println("\n--- Polymorphism with Array/List ---");
        Animal[] pets=new Animal[3]; //create Animal array
        pets[0]=new Dog("Rex", 4, "Labrador");
        pets[1]=new Cat("Mittens", 2, true);
        pets[2]=new Dog("Buddy", 3, "Golden Retriever");

        System.out.println("Processing pets:");
        for(Animal pet:pets){
            if(pet== null) continue; //skip null entries
            System.out.println("Pet Name: "+pet.getName());
            pet.makeSound(); //polymorphic call

            //call specific methods Downcasting
            if(pet instanceof Dog){
                System.out.println("  -> It's a dog!");
                Dog specificDog=(Dog)pet; //downcasting
                specificDog.bark();
                System.out.println("  -> Dog breed: "+specificDog.getBreed());
            }else if(pet instanceof Cat){
                System.out.println("  -> It's a cat!");
                Cat specificCat=(Cat)pet; //downcasting
                specificCat.scratch();
                System.out.println("  -> Cat likes laser pointer: "+specificCat.isLikeLaserPointer());
            }else {
                System.out.println("  -> It's just a generic animal!");
            }
            System.out.println("---------------------------------------------------------");
            }

        Dog dog = new Dog("Max", 5, "Beagle");
        Cat cat = new Cat("Mittens", 2, true);

        System.out.println("\n--- Abstract Class Tests ---");
        dog.eat();
        cat.sleep();
        dog.makeSound();
        cat.move();
        System.out.println("---------------------------------");

        System.out.println("\n --- Interface Polymorphism Tests ---");

        // Create instances of classes implementing interfaces
        Flyable flyer1 = new Bird();
        Flyable flyer2 = new Plane();
        Flyable flyerDuck = new Duck();
        Swimmable swimmer1 = new Fish();
        Swimmable swimmerDuck  = new Duck();

        //1. Interface reference
        System.out.println("Testing fly() via Flyable reference:");
        flyer1.fly();
        flyer2.fly();
        flyerDuck.fly();

        System.out.println("\nTesting swim() via Swimmable reference:");
        swimmer1.swim();
        swimmerDuck.swim();

        System.out.println("\nProcessing Flyable objects in an array:");
        Flyable[] flyers = {flyer1, flyer2, flyerDuck};
        for(Flyable flyer:flyers){
            flyer.takeOff();
            flyer.fly();
            flyer.land();
            System.out.println("---------------------------------");
        }
        System.out.println("-------------------------------------");


        System.out.println("\n --- Interface Default & Static Method Tests---");
        Bird bird = new Bird();
        Plane plane = new Plane();
        Duck duck = new Duck();

        // Call default method
        System.out.println("Testing default method:");
        bird.performEmergencyLanding();
        plane.performEmergencyLanding();
        duck.performEmergencyLanding();

        //2. Call static method
        System.out.println("Testing static method:");
        String regulations = Flyable.getFlightRegulations();
        System.out.println("Flight Regulations: " + regulations);


      class AdvancedPlane extends Plane {
          @Override
          public void performEmergencyLanding() {
              System.out.println("Advanced Plane executing specific emergency landing!");
              super.performEmergencyLanding(); // 调用 Flyable 接口的默认实现
          }
      }
        AdvancedPlane advancedPlane = new AdvancedPlane();
        advancedPlane.performEmergencyLanding();
        }

}
