package Guvi;

import java.util.*;

public class Avg_array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Number of elements in array");
		int n=in.nextInt();
		
		int[] arr=new int[n];
		
		int len=n/2;
		int val1=0,val2=0;
		float avg1,avg2;
		System.out.println("Enter the Values");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			if(i>=len)
				val2+=arr[i];
			else
				val1+=arr[i];
		}
		
		avg1=val1/len;
		avg2=val2/(n-len);
		if(avg1==avg2)
			System.out.println("Possible");
		else
			System.out.println("Not Possible");
		in.close();
	}

}
