package org.mvc.learn;

public class MVCCalculator {

    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        Calculator theModel = new Calculator();
        CalculatorController theController =new CalculatorController(theView,theModel);
        theView.setVisible(true);

    }
}
