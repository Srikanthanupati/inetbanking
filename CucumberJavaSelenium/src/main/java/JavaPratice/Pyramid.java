package JavaPratice;

public class Pyramid 
{

	public static void main(String[] args) 
	{
	 for (int i=0;i<10;i++) // outer loop to handle number of rows
	 {
		 for(int j=0;j<i;j++)   //  inner loop to handle number of columns
		 {
		 System.out.print("*");
		 }
		 System.out.println("*");
	 }	
	}

}
