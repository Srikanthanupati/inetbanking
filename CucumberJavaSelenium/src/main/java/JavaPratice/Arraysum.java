package JavaPratice;
import java.util.*;

public class Arraysum {

	public static void main(String[] args)
	{
		int[] a= {5,6,8,9,9,6};
		
		
		int b=0;
		int i;
		for(i=0;i<=a.length-1;i++) 
		{
		  b= b+a[i];	
		}
		
		System.out.print(b);
		
		
	}

}
