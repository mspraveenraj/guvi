package Guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_rep {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		String b[]=new String[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			b[i]=Integer.toBinaryString(a[i]);
		}
		
		int max=0;
		String temp;
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<b[i].length();j++)
			{
				if(b[i].charAt(j)==1)
				{
					c++;
				}
				
				if(max<c)
				{
					max=c;
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(Integer.parseInt(b[i],2));
		}
		in.close();
	}
}
