package com.onlineexam.sdp_assignment1;

public class main {

    public static void main(String[] args) {

        CarDirector director = new CarDirector();

        Car sportCar = director.createSportCar();
        Car familyCar = director.createFamilyCar();
        Car luxuryCar = director.createLuxuryCar();

        Car customCar = new CarBuilder()
                .setBrand("Audi")
                .setModel("A6")
                .setEngine("2.0L")
                .setColor("Blue")
                .setTransmission("Automatic")
                .setAirConditioning(true)
                .setGps(false)
                .build();

        System.out.println("Sport Car:");
        System.out.println(sportCar);

        System.out.println();

        System.out.println("Family Car:");
        System.out.println(familyCar);

        System.out.println();

        System.out.println("Luxury Car:");
        System.out.println(luxuryCar);

        System.out.println();

        System.out.println("Custom Car:");
        System.out.println(customCar);
    }
}