package com.eenum;

import java.util.Scanner;

public class UnionAccess {

    public void accessUnionTerritory() {
        System.out.println("........................Population Size of Each Union Territory....................");

        for (UnionTerritories union_territory : UnionTerritories.values()) {
            System.out.println(union_territory);
            System.out.println("\t" + "---" + union_territory.populationsize);


        }
    }
}
