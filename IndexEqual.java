package Guvi;

import java.util.*;

public class IndexEqual {
	
	static int indexValue(int []a,int i)
	{
		Arrays.sort(a);
		
		if(i>a.length-1)
			return 0;
		else
			return a[i];
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements");
		
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		System.out.println("Enter the index");
		int i=in.nextInt();
		
		int result=indexValue(a,i);
		if(result==0)
			System.out.println("Invalid index");
		else 
			System.out.println("Value at index "+ i +" is "+ result);
		
		in.close();
	}
}
