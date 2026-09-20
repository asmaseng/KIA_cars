package edu.aitu.kia.factorymethod;

public class K5Factory extends CarFactory {

    @Override
    public Car createCar() {
        return new KiaK5();
    }
}