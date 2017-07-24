package Guvi;

import java.util.*;

public class FindUnique {
	
	static List<Integer> findUnique(int []a)
	{
		List<Integer> list=new LinkedList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			boolean ans=true;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j]&&i!=j)
					ans=false;
			}
			if(ans)
				list.add(a[i]);
		}
		return list;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n=in.nextInt();		
		
		System.out.println("Enter the elements");
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
		System.out.println("Unique Elements are " + findUnique(a));
		
		in.close();
	}
}
