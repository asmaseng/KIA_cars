package edu.aitu.kia.abstractfactory.sport;

import edu.aitu.kia.abstractfactory.KiaInterior;

public class SportKiaInterior implements KiaInterior {

    public static final String DESCRIPTION = "Sport leather interior";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}