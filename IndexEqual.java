package Guvi;

import java.util.*;

public class IndexEqual {
	
	static void indexValue(int []a)
	{
		Arrays.sort(a);
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==a[i])
			{
				System.out.println("Value at index "+ i +" is "+ a[i]);
				c++;
			}
		}
		if(c==0)
			System.out.println("Invalid index");
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements");
		
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		indexValue(a);
		
		in.close();
	}
}
