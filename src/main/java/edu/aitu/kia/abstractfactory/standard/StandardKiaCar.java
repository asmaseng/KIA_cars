package edu.aitu.kia.abstractfactory.standard;

import edu.aitu.kia.abstractfactory.KiaCar;

public class StandardKiaCar implements KiaCar {

    public static final String MODEL = "Kia Sportage Standard";

    @Override
    public String getModel() {
        return MODEL;
    }
}