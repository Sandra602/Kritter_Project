package com.singleton;

public class Country{

    //creating static instance of the class
    static Country country1 = new Country(); //eager type

    //private constructor
    private Country(){
        System.out.println("Country is INDIA -- A Land with varieties of Culture, Language, Food...A Land of Diversity!!!!!!!");
    }

    //static method that return object of country
     public static Country getInstance(){
        return country1;
     }
}


