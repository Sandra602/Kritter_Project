package com.main;

import com.abstra.Kerala;
import com.eenum.UnionAccess;
import com.eenum.UnionTerritories;
import com.inheritance.*;
import com.list.all.EastIndianStates;
import com.list.all.NorthIndianStates;
import com.list.all.SouthIndianStates;
import com.list.all.WestIndianStates;
import com.read.write.President;
import com.read.write.PresidentWriter;
import com.singleton.Country;
import com.singleton.Country1;
import com.stat.Details;
import com.stat.IndiaDetails;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class AcrossTheGlobe {

    public static void main(String[] args) {

        Country one = Country.getInstance();

        System.out.println("\n");

        Country1 two = Country1.getCountry1();
        Country1 three =Country1.getCountry1();

        System.out.println("\n");

        WestBengal wes= new WestBengal();
        wes.population1();
        wes.population2();

        //enum
        for(UnionTerritories union_territory : UnionTerritories.values()){
            System.out.println(union_territory);
        }

        UnionAccess acccess= new UnionAccess();
        acccess.accessUnionTerritory();

        //South Indian States
        System.out.println("......................South Indian States..........................");
        SouthIndianStates south_states = new SouthIndianStates();
        south_states.south();

        //North Indian States
        System.out.println("......................North Indian States..........................");
        NorthIndianStates north_states = new NorthIndianStates();
        north_states.north();

        //East Indian States
        System.out.println("......................East Indian States..........................");
        EastIndianStates east_states = new EastIndianStates();
        east_states.east_states();

        //West Indian States
        System.out.println("......................West Indian States..........................");
        WestIndianStates west_states = new WestIndianStates();
        west_states.west();

        //Abstract Class
//        System.out.println("...................................Kerala......................................");
//        Kerala kel_details = new Kerala();
//        kel_details.makeGovt();
//        kel_details.makearea();
//        kel_details.makesize();

        // Create instance of nested Static class
        IndiaDetails.NestedStaticClass printer
                = new IndiaDetails.NestedStaticClass();

        // Call non static method of nested
        // static class
        printer.printMessage();

        // In order to create instance of
        // Inner class we need an Outer class
        // instance. Let us create Outer class
        // instance for creating
        // non-static nested class
        IndiaDetails outer = new IndiaDetails();
        IndiaDetails.InnerClass inner
                = outer.new InnerClass();

        // Calling non-static method of Inner class
        inner.display();

        // We can also combine above steps in one
        // step to create instance of Inner class
        IndiaDetails.InnerClass innerObject
                = new IndiaDetails().new InnerClass();

        // Similarly we can now call Inner class method
        innerObject.display();

        //static methods and variables
        Details.indiaDetails();

        //file writer
        President presi_names=new President();
        presi_names.president_writer("Prathibha Patil",2010);

        PresidentWriter presi_wite=new PresidentWriter();
        presi_wite.presidentwriter();


    }
}
