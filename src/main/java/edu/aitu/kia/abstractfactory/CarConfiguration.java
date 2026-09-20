package edu.aitu.kia.abstractfactory;

public class CarConfiguration {

    private final String model;
    private final String engine;
    private final String interior;

    public CarConfiguration(String model, String engine, String interior) {
        validate(model, "Model");
        validate(engine, "Engine");
        validate(interior, "Interior");

        this.model = model;
        this.engine = engine;
        this.interior = interior;
    }

    private void validate(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    fieldName + " cannot be empty"
            );
        }
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getInterior() {
        return interior;
    }
}