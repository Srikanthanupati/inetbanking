package JavaPratice;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter number to verify ");
		int a = Scan.nextInt();
		Scan.close();
		int b=1;
		
		for(int i=2;i<=a-1;i++)
		{
			if(a%i==0) 
			{
			b++;
			}
			
			
		}
		if(b<=2) 
		{
			System.out.print(a+ "   its  a prime number");
		}
		else
		{
			System.out.print(a+ "   its not a prime number");
		}
		
	}

}
