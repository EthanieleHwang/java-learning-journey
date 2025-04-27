package com.learning.oop.week2.interfaces;

public interface Flyable {
    //Constants
    int DEFAULT_ALTITUDE=1000;

    //Abstract methods

    void takeOff();
    void fly();
    void land();

    //Default method
    default void performEmergencyLanding() {
        System.out.println("Performing emergency landing at altitude: " + DEFAULT_ALTITUDE);
        land();
    }

    //Static method
    static String getFlightRegulations() {
        return "All aircraft must follow the flight regulations set by the aviation authority.";
    }
}