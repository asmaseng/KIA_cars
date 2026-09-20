package edu.aitu.kia.factorymethod;

public class KiaSportage implements Car {

    @Override
    public String getModel() {
        return "Kia Sportage";
    }

    @Override
    public String getEngineType() {
        return "2.0L Petrol";
    }

    @Override
    public void showInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Engine: " + getEngineType());
    }
}