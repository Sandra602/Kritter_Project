package com.list.all;

//Linked List

import java.util.ArrayList;

public class NorthIndianStates {
    public void north(){
        ArrayList<String> north_states= new ArrayList<>();
        // Adding all elements to List
         north_states.add("Delhi");
         north_states.add("Haryana");
         north_states.add("Jammu and Kashmir");
        north_states.add("Uttarpradesh");
        north_states.add("Punjab");
        north_states.add( "Uttarakhand");
        north_states.add("Himachal Pradesh");

        // Printing elements one by one
        for (int i = 0; i < north_states.size(); i++)
            System.out.print(north_states.get(i) + "\n");
    }
}
