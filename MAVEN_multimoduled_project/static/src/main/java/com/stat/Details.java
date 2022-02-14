package com.stat;

public class Details {
    static String countryName,primeMinister,bird,animal;
    static int noOfStates;

    public static void indiaDetails() {
        countryName="India";
        noOfStates = 29;
        primeMinister = "Narendra Modi";
        bird="Peacock";
        animal="Tiger";

        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("                            India                          ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Country Name :" + countryName);
        System.out.println("No of States :" + noOfStates);
        System.out.println("Prime Minister :" + primeMinister);
        System.out.println("National Bird :" + bird);
        System.out.println("National Animal :" + animal);
    }
}
