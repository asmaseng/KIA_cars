package edu.aitu.kia.abstractfactory;

public interface KiaAbstractFactory {

    KiaCar createCar();

    KiaEngine createEngine();

    KiaInterior createInterior();
}