package JavaPratice;

import java.util.Scanner;

public class Bigin3
{

	public static void main(String[] args) 
	{
		System.out.print("Enter a , b , c values");
		
		Scanner sc = new Scanner(System.in);
		
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	char d=sc.next().charAt(3);
	
	if(a>b && a>c)
	{
		System.out.println(" bigger number is   "+ a + d);
	}
	else if(b>c)
	{
		System.out.println(" bigger number is   "+ b +d);
	}
	else {
	
		System.out.println(" bigger number is   "+ c + d);
	}
	}


}
