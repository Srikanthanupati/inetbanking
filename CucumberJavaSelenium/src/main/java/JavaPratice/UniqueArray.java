package JavaPratice;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueArray
{

	public static void main(String[] args)
	{
		int a[] = {1,1,1,1,2,3,4,5};
		HashSet<Integer> ab = new HashSet<Integer>();
		HashSet<Integer> abc = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			if(ab.add(a[i])==true)
			{
				ab.add(a[i]);
			}else
			{
				abc.add(a[i]);
			}
		}System.out.println(ab);
		System.out.println(abc);
	}

}
