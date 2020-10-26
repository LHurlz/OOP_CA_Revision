import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class ex2{
	public static void main(String args[])
	{
		int studentIDs[] =  new int[5];
		float heights[] = new float[5];
		char grades[] = new char[5];
		int subscript, searchID;
		String searchIDstring;
		
		populateArrays(studentIDs, heights, grades);
		
		displayTable(studentIDs, heights, grades);
		
		searchIDstring = JOptionPane.showInputDialog("Please enter the ID number of the student you seek: ");
		searchID = Integer.parseInt(searchIDstring);
		
		subscript = linearSearch(studentIDs, searchID);
			
		if(subscript != -1)
		{
			JOptionPane.showMessageDialog(null,"The details of the student are as follows:\nID number ...... " + searchID + "\nHeight ...... " +
				                          heights[subscript] + "\nAverage grade ...... " + grades[subscript],"Student Details",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else
		{
				JOptionPane.showMessageDialog(null,"You entered an invalid ID number","Student Details",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public static void populateArrays(int id_nos[], float h[], char g[])
	{
		String IDsAsString, heightAsString, gradeAsString;
		
		for(int i=0; i<id_nos.length; i++)
		{
			IDsAsString = JOptionPane.showInputDialog("Please enter the ID number of student number "+(i+1)+": ");
			id_nos[i]=Integer.parseInt(IDsAsString);
			
			heightAsString = JOptionPane.showInputDialog("Please enter the height of student number "+(i+1)+": ");
			h[i]=Float.parseFloat(heightAsString);
			
			gradeAsString = JOptionPane.showInputDialog("Please enter the average grade of student number "+(i+1)+": ");
			g[i]=gradeAsString.charAt(0);
		}
	}
	
	public static void displayTable(int id_nos[], float h[], char g[])
	{
		String text="";
		Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
		JTextArea textArea = new JTextArea(10,20);
		
		textArea.setFont(textAreaFont);
		
		text+=String.format("%-12s%-9s%-16s","Student ID","Height","Average Grade");
		text+=String.format("\n%-12s%-9s%-16s","------------","---------","----------------");
		
		for(int i=0; i<id_nos.length; i++)
			text+=String.format("\n%-12d%-9.2f%-16c",id_nos[i],h[i],g[i]);
			
		textArea.append(text);
		
		JOptionPane.showMessageDialog(null,text,"All Student Details",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int linearSearch(int id_nos[], int key)
	{
		for(int i=0; i<id_nos.length; i++)
			if(id_nos[i]==key)
				return i;
				
		return -1;
	}
}
