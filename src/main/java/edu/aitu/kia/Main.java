package edu.aitu.kia;

import edu.aitu.kia.abstractfactory.KiaClient;
import edu.aitu.kia.abstractfactory.sport.KiaSportFactory;
import edu.aitu.kia.abstractfactory.standard.KiaStandardFactory;
import edu.aitu.kia.factorymethod.Car;
import edu.aitu.kia.factorymethod.CarFactory;
import edu.aitu.kia.factorymethod.K5Factory;
import edu.aitu.kia.factorymethod.SportageFactory;

public class Main {

    public static void main(String[] args) {

        demonstrateFactoryMethod();

        System.out.println();

        demonstrateAbstractFactory();
    }

    private static void demonstrateFactoryMethod() {
        System.out.println("=== FACTORY METHOD ===");

        CarFactory sportageFactory = new SportageFactory();
        Car sportage = sportageFactory.createCar();
        sportage.showInfo();

        System.out.println();

        CarFactory k5Factory = new K5Factory();
        Car k5 = k5Factory.createCar();
        k5.showInfo();
    }

    private static void demonstrateAbstractFactory() {
        System.out.println("=== ABSTRACT FACTORY ===");

        System.out.println("\nStandard Kia family:");

        KiaClient standardClient =
                new KiaClient(new KiaStandardFactory());

        standardClient.showConfiguration();

        System.out.println("\nSport Kia family:");

        KiaClient sportClient =
                new KiaClient(new KiaSportFactory());

        sportClient.showConfiguration();
    }
}