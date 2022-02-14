package com.singleton;

public class World {
    public static void main(String[] args) {
        Country one = Country.getInstance();

        System.out.println("\n");

        Country1 two =Country1.getCountry1();
        Country1 three =Country1.getCountry1();

        System.out.println("\n");

        Thread t1=new Thread(new Runnable() {
            //@Override
            public void run() {
                Country four =Country.getInstance();
            }
        });

        Thread t2=new Thread(new Runnable() {
            //@Override
            public void run() {
                Country four =Country.getInstance();
            }
        });
        t1.start();
        t2.start();
        }


    }

