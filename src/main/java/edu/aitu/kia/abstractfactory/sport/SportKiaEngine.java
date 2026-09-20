package edu.aitu.kia.abstractfactory.sport;

import edu.aitu.kia.abstractfactory.KiaEngine;

public class SportKiaEngine implements KiaEngine {

    public static final String DESCRIPTION = "2.5L turbo petrol engine, 290 HP";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}