package edu.aitu.kia.factorymethod;

public class KiaK5 implements Car {

    @Override
    public String getModel() {
        return "Kia K5";
    }

    @Override
    public String getEngineType() {
        return "2.5L Petrol";
    }

    @Override
    public void showInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Engine: " + getEngineType());
    }
}