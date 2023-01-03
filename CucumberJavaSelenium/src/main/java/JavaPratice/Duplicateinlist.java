package JavaPratice;

import java.util.*;
public class Duplicateinlist 
{

	public static void main(String[] args) 
	{
		
		List<String> list = new ArrayList<String>();
	
		
		list.add("ramu");
		list.add("raghu");
		list.add("shiva");
		list.add("raghu");
		list.add("shiva");
		
		Set<String> a = new HashSet<String>();
		
		for(String list1 : list) 
		{
		 if(a.add(list1)==false)	
			System.out.println(list1);
		}
		
	}
	
}	
		