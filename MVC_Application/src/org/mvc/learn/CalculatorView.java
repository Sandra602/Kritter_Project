package org.mvc.learn;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField first = new JTextField(10);
    private JLabel addition = new JLabel("+");
    private JTextField second = new JTextField(10);
    private JButton calculate = new JButton("Calculate");
    private JTextField solution = new JTextField(10);

    CalculatorView(){
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,200);

        calcPanel.add(first);
        calcPanel.add(addition);
        calcPanel.add(second);
        calcPanel.add(calculate);
        calcPanel.add(solution);

        this.add(calcPanel);
    }

    public int getfirst(){
        return Integer.parseInt(first.getText());
    }
    public int getsecond(){
        return Integer.parseInt(second.getText());
    }

    public int getsolution(){
        return Integer.parseInt(solution.getText());
    }
    public void setSolution(int calsolution){
        solution.setText(Integer.toString(calsolution));
        
    }
    void addCalculationListener(ActionListener listenForCalcButton){
        calculate.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);

    }
}
