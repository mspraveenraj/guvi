package Guvi;
import java.util.*;
public class SumCloseToZero 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		for(int i=0;i<n-1;i++)
		{
			if(a[i]+a[i+1]>-3 && a[i]+a[i+1]<3)
				System.out.println(a[i]+" "+a[i+1]);
		}
		in.close();
	}
}