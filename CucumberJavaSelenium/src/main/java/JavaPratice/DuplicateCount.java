package JavaPratice;

import java.util.HashSet;

public class DuplicateCount {

	public static void main(String[] args) {
		int a[] = {1,1,1,1,2,3,4,5};
		int b=0;
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
		}
		b=ab.size();
		System.out.println(b);
	}

}
