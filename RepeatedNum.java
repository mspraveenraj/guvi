package Guvi;

import java.util.*;
public class RepeatedNum {

	public static void main(String[] args) {	
		Scanner in=new Scanner(System.in);
		
		LinkedHashSet<Integer> number=new LinkedHashSet<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter number of elements");
		int n=in.nextInt();
		
		System.out.println("Enter registration numbers");
		
		for(int i=0;i<n;i++)
		{
			int k=in.nextInt();
			if(!number.add(k))
				list.add(k);	
		}
		
		System.out.println("Duplicates are");
		System.out.println(list);
		in.close();
	}
}
