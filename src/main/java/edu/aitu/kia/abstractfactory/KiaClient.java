package edu.aitu.kia.abstractfactory;

public class KiaClient {

    private final KiaAbstractFactory factory;

    public KiaClient(KiaAbstractFactory factory) {
        this.factory = factory;
    }

    public void showConfiguration() {
        KiaCar car = factory.createCar();
        KiaEngine engine = factory.createEngine();
        KiaInterior interior = factory.createInterior();

        CarConfiguration configuration = new CarConfiguration(
                car.getModel(),
                engine.getDescription(),
                interior.getDescription()
        );

        printConfiguration(configuration);
    }

    private void printConfiguration(CarConfiguration configuration) {
        System.out.println("Model: " + configuration.getModel());
        System.out.println("Engine: " + configuration.getEngine());
        System.out.println("Interior: " + configuration.getInterior());
    }
}