import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JOptionPane;


public class ex1{
	public static void main(String args[])
	{
		String names[] = {"James Maye","Joe Bloggs","Jane Doe","Teresa Coughlan","Sam Stewart"};
		double gpas[] = {3.56, 2.47, 3.12, 2.55, 2.78};
		
		selectionSort(names, gpas);
		
		displayResults(names, gpas);
		
		JOptionPane.showMessageDialog(null,"The average GPA is " + String.format("%.0f",averageGPA(gpas)));
		
		JOptionPane.showMessageDialog(null,"The standard deviation of the GPAs is " + String.format("%.3f",standardDev(gpas)));
		
	}
	
	public static void selectionSort(String[] names, double[] gpas)
	{
		double smallest,temp;
		String tempString;
		int sub;
		
		for(int i=0; i<gpas.length-1; i++)
		{
			smallest=gpas[i];
			sub=i;
			
			for(int j=i+1; j<gpas.length; j++)
			  if(gpas[j]<smallest)
			    {
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
	
	public static void displayResults(String[] names, double[] gpas)
	{
		JTextArea textArea = new JTextArea(10,20);
		Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
		textArea.setFont(textAreaFont);
		
		textArea.append(String.format("%-20s%-6s","Name","GPA"));
		textArea.append(String.format("\n%-20s%-6s","-------","-----\n"));
		
		for(int i=names.length-1; i>=0; i--)
		{
			textArea.append(String.format("%-20s%.2f\n",names[i],gpas[i]));
		}
		
		JOptionPane.showMessageDialog(null,textArea);
	}
	
	public static double averageGPA(double[] gpas)
	{
		double total=0;
		
		for(int i=0; i<gpas.length; i++)
		{
			total+=gpas[i];
		}
		
		return total/gpas.length;
	}
	
	public static double standardDev(double[] gpas)
	{
		double total=0, avg = averageGPA(gpas);
		
		for(int i=0; i<gpas.length; i++)
			total += Math.pow(avg-gpas[i],2);
			
		return Math.sqrt(total/gpas.length);
	}  
}