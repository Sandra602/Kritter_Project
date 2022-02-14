package com.singleton;

//Lazy Instantiation

public class Country1 {

    public static Country1 country1;

    //private constructor
    private Country1() {
        System.out.println("*********************************************************************************************");
        System.out.println("Country is INDIA ---------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("*********************************************************************************************");
    }

    public static Country1 getCountry1() {

        //checking whether country1 is null
        if (country1 == null) {

            //Double Checked Locking
            synchronized (Country1.class) {
                if (country1 == null) country1 = new Country1();

            }
        }
        return country1;
    }
}
