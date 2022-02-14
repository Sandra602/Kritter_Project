package org.mvc.learn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theview;
    private Calculator theModel;

    public CalculatorController(CalculatorView theview,Calculator theModel) {
        this.theview = theview;
        this.theModel = theModel;

        this.theview.addCalculationListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            int first,second=0;
            try{
                first=theview.getfirst();
                second=theview.getsecond();

                theModel.addtwonumbers(first,second);

                theview.setSolution(theModel.getValue());

            }catch (NumberFormatException ex){

            }
        }


    }
}
