package Guvi;

import java.util.*;

public class Seed {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=n;
		int sum=1;
		int f=0;
		while(a!=0)
		{
			int x=a%10;
			if(x==0)
			{
				System.out.println("Cannot find Seed as it contains 0");
				f=1;
				break;
			}
			sum*=x;
			a/=10;
		}
		if(f==0)
			System.out.println(n*sum);
		in.close();
	}

}
