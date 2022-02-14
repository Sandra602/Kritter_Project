package com.list.all;

import java.util.LinkedList;

public class EastIndianStates {
    public void east_states(){
        LinkedList<String> eaststates = new LinkedList<String>();
        eaststates.addFirst("Bhihar");
        eaststates.add("Jharkhand");
        eaststates.add("Odhisha");
        eaststates.addLast("West Bengal");

        eaststates.remove("Bhihar");

        for (int i = 0; i < eaststates.size(); i++) {
            System.out.print(eaststates.get(i) + "\n");
        }


    }
}
