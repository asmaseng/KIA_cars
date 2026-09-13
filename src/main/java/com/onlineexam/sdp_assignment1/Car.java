package com.onlineexam.sdp_assignment1;

public class Car {

    private final String brand;
    private final String model;
    private final String engine;
    private final String color;
    private final String transmission;
    private final boolean hasAirConditioning;
    private final boolean hasGps;

    public Car(String brand, String model, String engine, String color,
               String transmission, boolean hasAirConditioning, boolean hasGps) {

        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.transmission = transmission;
        this.hasAirConditioning = hasAirConditioning;
        this.hasGps = hasGps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", airConditioning=" + hasAirConditioning +
                ", gps=" + hasGps +
                '}';
    }
}