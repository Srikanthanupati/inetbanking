package JavaPratice;
import java.util.*;
public class Scanexample {
		

	public static void main(String[] args) {
		System.out.println("biggest number is ");
	Scanner sc = new Scanner(System.in);
	
	
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if ( a>b && a>c)
		{
			System.out.println(a);
		}
		else if (b>c) 
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(c);	
		}
		

	

	}

}
