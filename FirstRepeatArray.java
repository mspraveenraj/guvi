package Guvi;

import java.util.*;

public class FirstRepeatArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
   	 	int i,n,ans=0,j=0;
   	 	
   	 	System.out.println("Enter the array size:");
   		n=in.nextInt();
   		int[] a=new int[n];
   		
   		System.out.println("Enter the array elements:");
   		
   		for(i=0;i<n;i++)
   		{
   			a[i]=in.nextInt();
   		}
   		
   		for(i=0;i<n;i++)
   		{
   			for(j=i+1;j<n;j++)
   			{
   				if(a[i]==a[j])
   				{
   					System.out.println("The First Repeating Element is : "+a[i]);
   					ans++;
   					break;
   				}
   			}
   			if(ans>0)
   				break;
       	}
   		if(ans==0)
   			System.out.println("No repeating elements");
   		in.close();
	}
}
