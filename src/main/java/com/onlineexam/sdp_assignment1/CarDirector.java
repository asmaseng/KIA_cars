package com.onlineexam.sdp_assignment1;

public class CarDirector {

    private static final String AUTOMATIC_TRANSMISSION = "Automatic";

    public Car createSportCar() {
        return new CarBuilder()
                .setBrand("BMW")
                .setModel("M5")
                .setEngine("V8")
                .setColor("Black")
                .setTransmission(AUTOMATIC_TRANSMISSION)
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
                .setTransmission(AUTOMATIC_TRANSMISSION)
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
                .setTransmission(AUTOMATIC_TRANSMISSION)
                .setAirConditioning(true)
                .setGps(true)
                .build();
    }
}