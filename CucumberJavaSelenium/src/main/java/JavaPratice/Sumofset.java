package JavaPratice;
import java.util.*;

public class Sumofset {

	public static void main(String[] args) 
	{
		
	
		
		Set<Integer> i  = new HashSet<Integer>();
		i.add(25);
		i.add(50);
		i.add(25);
		i.add(58);
		i.add(2);
		i.add(5);
		
		
		System.out.println(i);
		
		Object[] a=i.toArray();
		
		Integer[] m = new Integer[a.length];
		
		int k =0;
		for(k =0;k<=a.length-1;k++) 
		{
			m[k]=(Integer)a[k];
			
		}
		

		int j;
		int b=0;
		
		for(j=0;j<=m.length-1;j++) 
		{
			
			b = b + m[j];
		}
		System.out.print(b);
		
		 
		
		
	}

}