package com.onlineexam.sdp_assignment1;

public class CarBuilder {

    private String brand;
    private String model;
    private String engine;
    private String color;
    private String transmission;
    private boolean hasAirConditioning;
    private boolean hasGps;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
        return this;
    }

    public CarBuilder setGps(boolean hasGps) {
        this.hasGps = hasGps;
        return this;
    }

    public Car build() {

        if (brand == null || brand.isBlank()) {
            throw new IllegalStateException("Brand is required");
        }

        if (model == null || model.isBlank()) {
            throw new IllegalStateException("Model is required");
        }

        if (engine == null || engine.isBlank()) {
            throw new IllegalStateException("Engine is required");
        }

        if (color == null || color.isBlank()) {
            throw new IllegalStateException("Color is required");
        }

        if (transmission == null || transmission.isBlank()) {
            throw new IllegalStateException("Transmission is required");
        }

        return new Car(
                brand,
                model,
                engine,
                color,
                transmission,
                hasAirConditioning,
                hasGps
        );
    }
}