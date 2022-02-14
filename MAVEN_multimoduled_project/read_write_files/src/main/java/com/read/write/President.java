package com.read.write;

//FileWriter

import java.io.FileWriter;
import java.io.IOException;

public class President {

    public void president_writer(String name, int year){
        try {
            FileWriter myWriter = new FileWriter("presidentNames.txt");
            myWriter.write("Name "+name+"\n"+"Year"+"\n"+year);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
