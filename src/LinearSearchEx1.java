import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

public class LinearSearchEx1 {
    public static void main(String[] args) {
        int[] ids = new int[5];
        float[] heights = new float[5];
        char[] grades = new char[5];

        populateArrays(ids,heights,grades);

        displayTable(ids,heights,grades);

        String searchIDAsString = JOptionPane.showInputDialog("Please enter the ID of the student you seek");
        int searchID=Integer.parseInt(searchIDAsString);

        int sub=linearSearch(ids,searchID);

        if(linearSearch(ids,searchID)==-1)
            JOptionPane.showMessageDialog(null,"Student not found");
        else
            JOptionPane.showMessageDialog(null,"The details of the student are as follows:\nID Number .... " + ids[sub] +
                    "\nHeight ...... " + heights[sub] + "\nAverage Grade ..... " + grades[sub]);


    }

    private static void populateArrays(int[] ids,float[] heights,char[] grades){
        for(int i=0; i<ids.length; i++){
            ids[i]=Integer.parseInt(JOptionPane.showInputDialog("Please enter the ID for student "+(i+1)));
            heights[i]=Float.parseFloat(JOptionPane.showInputDialog("Please enter the height for student "+(i+1)));
            grades[i]=JOptionPane.showInputDialog("Please enter the average grade for student "+(i+1)).charAt(0);
        }
    }

    private static void displayTable(int[] ids,float[] heights,char[] grades){
        JTextArea textArea = new JTextArea();

        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.append(String.format("%-14s%-9s%-20s","Student ID","Height","Average Grade"));
        textArea.append(String.format("\n%-14s%-9s%-20s","----------","-------","--------------"));

        for(int i=0; i< ids.length; i++){
            textArea.append(String.format("\n%-14d%-9s%-20s",ids[i],heights[i],grades[i]));
        }

        JOptionPane.showMessageDialog(null,textArea);
    }

    private static int linearSearch(int[] ids, int searchID){
        int i;

        for(i=0; i<ids.length; i++){
            if(ids[i]==searchID)
                return i;
        }

        return -1;
    }
}
