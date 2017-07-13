package Guvi;

import java.text.DecimalFormat;
import java.util.*;

public class bitArrange {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		
		int l=(int) Math.pow(2,k);
		
		String a[]=new String[l];
		
		String zero="";
		
		for(int i=0;i<k;i++)
		{
			zero+="0";
		}
		
		DecimalFormat df = new DecimalFormat(zero); 
		
		for(int i=0;i<l;i++)
		{
			a[i]=Integer.toBinaryString(i);
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()<k)
			{
				int b=Integer.parseInt(a[i]);
				System.out.print(df.format(b)+" ");
			}
			
			else 
				System.out.print(a[i]+" ");
		}
		in.close();
	}
}
