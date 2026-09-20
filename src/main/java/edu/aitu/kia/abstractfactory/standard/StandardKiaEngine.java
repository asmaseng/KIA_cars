package edu.aitu.kia.abstractfactory.standard;

import edu.aitu.kia.abstractfactory.KiaEngine;

public class StandardKiaEngine implements KiaEngine {

    public static final String DESCRIPTION = "2.0L petrol engine, 150 HP";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}