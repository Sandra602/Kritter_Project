package com.eenum;

public enum UnionTerritories {
    ANDAMAN("4 Lakhs",1),
    CHANDIGARH("12 Lakhs",2),
    DAMANDIU("\t10.77 Lakhs",3),
    DELHI("2 Crores",4),
    JAMMU("1.34 Crores",5),
    LAKSHADWEEP("68000",6),
    PUDUCHERRY("15.71 Lakhs",7),
    LADAKH("2.97 Lakhs",8);

    final String populationsize;
    private final int i;

    UnionTerritories(String populationsize,int i) {

        this.populationsize=populationsize;
        this.i = i;
    }
}

