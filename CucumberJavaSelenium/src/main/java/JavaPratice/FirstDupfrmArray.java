package JavaPratice;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstDupfrmArray {

	public static void main(String[] args) 
	{
		String a[]= {"ramu","raju","ranjan","ramu","ranjan"};
	
		HashSet<String> set= new HashSet<String>();
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<=a.length-1;i++)
		{
			if(set.add(a[i])==true)
			{
				
				set.add(a[i]);  // stores unique elements
			}
			else
			{
				list.add(a[i]); // stores duplicate elements
			}
		}
		
		System.out.println("First duplicate element in array is  " +list.get(0));
		System.out.println("Last duplicate element in array is  " +list.get(list.size()-1));
		System.out.println("unique elements in array is   " +set);
		System.out.println("duplicate elements  in array is  " +list);
	}

}
