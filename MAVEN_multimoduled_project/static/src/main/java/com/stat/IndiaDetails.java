package com.stat;

// Java program to demonstrate how to
// implement static and non-static
// classes in a Java program.
public class IndiaDetails{
    private static String msg = "India, officially the Republic of India (Hindi: Bhārat Gaṇarājya),[23] is a country in South Asia. " +
            "It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world." +"\n"+
            " Bounded by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, " +
            "it shares land borders with Pakistan to the west;[f] China, Nepal, and Bhutan to the north; " +
            "and Bangladesh and Myanmar to the east. In the " +"\n"+
            "Indian Ocean, India is in the vicinity of Sri Lanka and the Maldives; " +
            "its Andaman and Nicobar Islands share a maritime border with Thailand, Myanmar and Indonesia. ";

    // Static nested class
    public static class NestedStaticClass {

        // Only static members of Outer class
        // is directly accessible in nested
        // static class
        public void printMessage()
        {

            // Try making 'message' a non-static
            // variable, there will be compiler error
            System.out.println("\n");
            System.out.println("************************************************************************************************");
            System.out.println(
                    "Message from nested static class: "
                            + msg);
        }
    }

    // Non-static nested class -
    // also called Inner class
    public class InnerClass {

        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void display()
        {
            System.out.println("\n");
            System.out.println("##############################################################################################################");
            System.out.println(
                    "Message from non-static nested class: "
                            + msg);
        }
    }
}


