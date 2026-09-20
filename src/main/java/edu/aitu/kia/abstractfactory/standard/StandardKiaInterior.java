package edu.aitu.kia.abstractfactory.standard;

import edu.aitu.kia.abstractfactory.KiaInterior;

public class StandardKiaInterior implements KiaInterior {

    public static final String DESCRIPTION = "Comfort fabric interior";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}