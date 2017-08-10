package Guvi;
import java.util.*;
public class KinderGarden 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of Children");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int p=n/2;
		for(int i=0;i<2*n;i++)
		{
			int x=2*n-i;
			if(p!=x)
			{   
				for(int j=1;j<=n;j++)
				System.out.println(j+" : "+p+" Pair");
			
			}
		}
		in.close();
	}
}
