package edu.aitu.kia.factorymethod;

public class SportageFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new KiaSportage();
    }
}