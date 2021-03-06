import java.util.Scanner;

public class LinearSearch{
	public static void main(String args[])
	{
		int stockIDs[] = new int[5], searchID, subscript;
		float prices[] = new float[5];
		
		Scanner input = new Scanner(System.in);
		
		readArray(stockIDs, prices);
		
		System.out.print("\n\nEnter the product id number you want the price for: ");
		searchID = input.nextInt();
		
		subscript = linearSearch(stockIDs, searchID);
		
		if(subscript != -1)
			System.out.println("The product ID number " + searchID + " has been found and its price is $" + prices[subscript]);
		else
			System.out.println("Sorry - the product number " + searchID + " has not been found");
	}
	
	public static void readArray(int id_nos[], float prices[])
	{
		int i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the product ID numbers and prices for " + id_nos.length + "stock items\n");
		
		for(i=0; i<id_nos.length; i++)
		{
			System.out.print("\nPlease enter the id number for product " + (i+1) + ": ");
			id_nos[i] = input.nextInt();
			System.out.print("\nPlease enter the price for this product: ");
			prices[i] = input.nextFloat();
		}
	}
	
	public static int linearSearch(int id_nos[], int key)
	{
		int i;
		
		for(i=0; i<id_nos.length; i++)
			if(id_nos[i]==key)
				return i;
		
		return -1;
	}
}