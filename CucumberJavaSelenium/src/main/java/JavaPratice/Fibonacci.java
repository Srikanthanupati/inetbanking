package JavaPratice;

public class Fibonacci {

	public static void main(String[] args) 
	{
		// 1 2 3 5 8 13 21 34
		
		int a=1;
		int b=2;
		System.out.print(a+ " "+b);
		int c;
		int i;
		for(i=0;i<=10;i++) 
		{
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
