import javax.swing.JOptionPane;
import java.util.Arrays;

public class SelectionSort{
	public static void main(String args[])
	{
		double weights[] = new double[10];
		
		populateArrays(weights);
		
		JOptionPane.showMessageDialog(null,"The unsorted weights array is:\n\n" + Arrays.toString(weights));
		
		selectionSort(weights);
		
		JOptionPane.showMessageDialog(null,"The sorted weights array is:\n\n" + Arrays.toString(weights));
	}
	
	public static void populateArrays(double weights[])
	{
		for(int i=0; i<weights.length; i++)
		{
			weights[i] =  Double.parseDouble(JOptionPane.showInputDialog("Enter weight for person " + (i+1)));
		}
	}
	
	public static void selectionSort(double weights[])
	{
		double smallest, temp;
		int sub;
		
		for(int i=0; i<weights.length; i++)
		{
			smallest=weights[i];
			sub=i;
			
			for(int j=i+1; j<weights.length; j++)
				if(weights[j]<smallest)
				  {
				  	  smallest=weights[j];
				  	  sub=j;
				  }
				  
			temp = weights[i];
			weights[i] = weights[sub];
			weights[sub]=temp;
		}
	}
}