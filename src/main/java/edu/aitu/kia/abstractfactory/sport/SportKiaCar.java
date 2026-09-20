package edu.aitu.kia.abstractfactory.sport;

import edu.aitu.kia.abstractfactory.KiaCar;

public class SportKiaCar implements KiaCar {

    public static final String MODEL = "Kia K5 GT-Line";

    @Override
    public String getModel() {
        return MODEL;
    }
}