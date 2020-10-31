package codingFromScratch;

import javax.swing.*;
import java.awt.*;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account('P',"JoeBloggs1234","password");
        Account acc2 = new Account('B',"JohnSmith123","123456");
        Account acc3 = new Account('P',"112AlanGreen_1123","salami");

        Account[] allAccounts = new Account[5];
        allAccounts[0]=acc1;
        allAccounts[1]=acc2;
        allAccounts[2]=acc3;

        System.out.println("Displaying the state of the 3 Account objects");

        for(int i=0; i< allAccounts.length; i++){
            if(allAccounts[i]!=null)
                System.out.println("\n\n"+allAccounts[i]);
        }

        System.out.println("\n\nChanging the password of the 2nd Account object");

        acc2.setPassword("bigchungus");

        System.out.println("\n\nDisplaying the new state of the 2nd Account object\n\n"+acc2.toString());

        Account acc4 = new Account('B',"Zzdogslammer","salad");
        Account acc5 = new Account('P',"S1d2fdf","passawordddd");

        allAccounts[3]=acc4;
        allAccounts[4]=acc5;

        System.out.println("\n\nDisplaying accounts in alphabetical order in textarea");

        selectionSort(allAccounts);

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.append(String.format("%-10s%-20s%-20s","Type","Username","Password"));
        textArea.append(String.format("\n%-10s%-20s%-20s","------","------------","------------\n"));

        for(int i=0; i< allAccounts.length; i++){
            if(allAccounts[i]!=null)
                textArea.append(String.format("\n%-10s%-20s%-20s",allAccounts[i].getType(),allAccounts[i].getUsername(),allAccounts[i].getPassword()));
        }

        JOptionPane.showMessageDialog(null,textArea);

        String query = JOptionPane.showInputDialog("Please enter the username of the account you seek");

        int sub=linearSearch(allAccounts,query);

        if(sub==-1)
            JOptionPane.showMessageDialog(null,"Account not found");
        else
            JOptionPane.showMessageDialog(null,"Account details are as follows:\n\n"+allAccounts[sub]);

    }

    private static void selectionSort(Account[] allAccounts){
        Account temp;
        int sub;
        String smallest;

        for(int i=0; i< allAccounts.length-1; i++){
            smallest=allAccounts[i].getUsername();
            sub=i;

            for(int j=i+1;j< allAccounts.length; j++){
                if(allAccounts[j].getUsername().compareTo(smallest)<0){
                    smallest=allAccounts[j].getUsername();
                    sub=j;
                }
            }

            temp=allAccounts[i];
            allAccounts[i]=allAccounts[sub];
            allAccounts[sub]=temp;

        }
    }

    private static int linearSearch(Account[] allAccounts, String query){
        int i;

        for(i=0; i< allAccounts.length; i++){
            if(allAccounts[i].getUsername().equals(query))
                return i;
        }

        return -1;
    }
}
