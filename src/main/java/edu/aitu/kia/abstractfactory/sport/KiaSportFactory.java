package edu.aitu.kia.abstractfactory.sport;

import edu.aitu.kia.abstractfactory.KiaAbstractFactory;
import edu.aitu.kia.abstractfactory.KiaCar;
import edu.aitu.kia.abstractfactory.KiaEngine;
import edu.aitu.kia.abstractfactory.KiaInterior;

public class KiaSportFactory implements KiaAbstractFactory {

    @Override
    public KiaCar createCar() {
        return new SportKiaCar();
    }

    @Override
    public KiaEngine createEngine() {
        return new SportKiaEngine();
    }

    @Override
    public KiaInterior createInterior() {
        return new SportKiaInterior();
    }
}