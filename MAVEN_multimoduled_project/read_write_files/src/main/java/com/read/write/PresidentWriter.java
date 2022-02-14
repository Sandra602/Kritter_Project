package com.read.write;

import java.io.FileReader;

public class PresidentWriter {
   public void presidentwriter(){
        // Creates an array of character
        char[] array = new char[50];

        try {
            //creating a file reader
            FileReader input = new FileReader("presidentNames.txt");

            //reads character
            input.read(array);
            System.out.println(" ..................................................................");
            System.out.println(" The file is opened...............");
            System.out.println(array);

            //closing the reader
            input.close();
        }catch(Exception e) {
            e.getStackTrace();
        }
    }
}
