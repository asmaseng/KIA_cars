package edu.aitu.kia.abstractfactory.standard;

import edu.aitu.kia.abstractfactory.KiaAbstractFactory;
import edu.aitu.kia.abstractfactory.KiaCar;
import edu.aitu.kia.abstractfactory.KiaEngine;
import edu.aitu.kia.abstractfactory.KiaInterior;

public class KiaStandardFactory implements KiaAbstractFactory {

    @Override
    public KiaCar createCar() {
        return new StandardKiaCar();
    }

    @Override
    public KiaEngine createEngine() {
        return new StandardKiaEngine();
    }

    @Override
    public KiaInterior createInterior() {
        return new StandardKiaInterior();
    }
}