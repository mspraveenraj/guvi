package Guvi;
import java.util.*;
public class PrimeSum100 
{
	public static void primeNumber()
	{
		Set<Integer> set=new TreeSet<Integer>();
		int count=0;
		int sum=0;
		int temp=0;
		for(int i=1;i<100;i++)
		{
			sum=0;
			temp=0;
			count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
        		{
					count++;	
        		}	
			}
        
			temp=i;
			if(count==2)
			{
				while(temp>0)
				{
					sum+=temp%10;
					temp=temp/10;
				}
				if(sum<100)
				{
					count=0;
					for(int j=sum;j>=1;j--)
					{
						if(sum%j==0){
							count++;
						}
             	
					}
					if(count==2)
					{
						if(set.contains(sum)){}
						else
						{
							set.add(sum);
							System.out.println(sum);
						}
					}
				}
        
			}
		}
	}
	public static void main(String[] args)
	{
		primeNumber();
	}
}
