package com.list.all;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//SETS

public class SouthIndianStates{
    public void south(){
    Set<String> south_states =new HashSet<>();
    south_states.add("Andra Pradesh");
        south_states.add("Telengana");
        south_states.add("Karnataka");
        south_states.add("Kerala");
        south_states.add("Tamil Nadu");

        // Iterating through iterators
        Iterator<String> i = south_states.iterator();

        // It holds true till there is a single element
        // remaining in the object
        while (i.hasNext())
            System.out.println(i.next());

}
}
