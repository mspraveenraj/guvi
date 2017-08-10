package Guvi;

import java.util.*;

public class ExactlyTwice {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		Set<Integer> set=new LinkedHashSet<Integer>();
		System.out.println("Enter the size");
		int n=in.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
		int count;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==2)
			{
				set.add(a[i]);
			}
		}
		if(set.size()==0)
			System.out.println("No repeated as exactly twice");
		else
			System.out.println("Repeated Exactly Twice are \n"+set);
		in.close();
	}
}