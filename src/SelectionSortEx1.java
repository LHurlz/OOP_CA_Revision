import javax.swing.*;
import java.awt.*;

public class SelectionSortEx1 {
    public static void main(String[] args) {
        String[] names = {"James Maye","Joe Bloggs","Jane Doe","Teresa Coughlan","Sam Stewart"};
        double[] gpas = {3.56,2.47,3.12,2.55,2.78};

        selectionSort(names,gpas);

        displayResults(names,gpas);

        JOptionPane.showMessageDialog(null,"The average GPA is " + String.format("%.0f",averageGPA(gpas)),"Average GPA",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"The standard deviation of the GPAs is " + String.format("%.3f",standardDeviationGPA(gpas)),"Standard Deviation",JOptionPane.INFORMATION_MESSAGE);

    }

    private static void selectionSort(String[] names, double[] gpas){
        double temp, smallest;
        String tempString;
        int sub;

        for(int i=0; i<gpas.length-1; i++){
            smallest=gpas[i];
            sub=i;

            for(int j=i+1; j<gpas.length; j++)
                if(gpas[j]<smallest){
                    smallest=gpas[j];
                    sub=j;
                }

            temp=gpas[i];
            gpas[i]=gpas[sub];
            gpas[sub]=temp;

            tempString=names[i];
            names[i]=names[sub];
            names[sub]=tempString;

        }
    }

    private static void displayResults(String[] names, double[] gpas){
        JTextArea textarea = new JTextArea();

        Font font = new Font("monospaced",Font.PLAIN,12);
        textarea.setFont(font);

        textarea.append(String.format("%-20s%-6s","Name","GPA"));
        textarea.append(String.format("\n%-20s%-6s","------","-----\n"));

        for(int i=names.length-1; i>=0; i--){
            textarea.append(String.format("\n%-20s%-6s",names[i],gpas[i]));
        }

        JOptionPane.showMessageDialog(null,textarea);
    }

    private static double averageGPA(double[] gpas){
        double total=0;

        for(int i=0; i<gpas.length; i++){
            total+=gpas[i];
        }

        return (total/gpas.length);
    }

    private static double standardDeviationGPA(double[] gpas){
        double total=0, average=averageGPA(gpas);

        for(int i=0; i<gpas.length; i++)
            total+=Math.pow(average-gpas[i],2);


        return Math.sqrt(total/gpas.length);

    }
}
