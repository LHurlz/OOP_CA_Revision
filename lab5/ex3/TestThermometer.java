package lab5.ex3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        String output="";

        Thermometer t1 = new Thermometer(35);

        output+="*****Thermometer Testing*****\n\nCalling the single-arg constructor, setting the temperature of first thermometer to 35C"
               +"\nFirst Thermometer:\n" + t1.toString();

        Thermometer t2 = new Thermometer();

        output+="\n\nCalling the no-arg constructor, setting temperature of second thermometer to 0C\nSecond Thermometer:\n" +
                t2.toString();

        t2.setTemperature(25);

        output+="\n\nCalling setTemperature, setting temperature of second thermometer to 25C\nSecond Thermometer:\n" +
                t2.toString();

        JOptionPane.showMessageDialog(null,output);

        int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temp of the first thermometer"));

        t1.setTemperature(input);

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\nCalling setTemperature(), setting temperature of first thermometer to "
                + input + "C\nFirst Thermometer:\n" + t1.toString());
    }
}
