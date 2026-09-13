package com.onlineexam.sdp_assignment1;

public class CarDirector {

    public Car createSportCar() {
        return new CarBuilder()
                .setBrand("BMW")
                .setModel("M5")
                .setEngine("V8")
                .setColor("Black")
                .setTransmission("Automatic")
                .setAirConditioning(true)
                .setGps(true)
                .build();
    }

    public Car createFamilyCar() {
        return new CarBuilder()
                .setBrand("Toyota")
                .setModel("Camry")
                .setEngine("2.5L")
                .setColor("White")
                .setTransmission("Automatic")
                .setAirConditioning(true)
                .setGps(false)
                .build();
    }
    public Car createLuxuryCar() {
        return new CarBuilder()
                .setBrand("Mercedes-Benz")
                .setModel("S-Class")
                .setEngine("V8")
                .setColor("Silver")
                .setTransmission("Automatic")
                .setAirConditioning(true)
                .setGps(true)
                .build();
    }
}