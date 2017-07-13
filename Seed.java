package Guvi;

import java.util.*;

public class Seed{

	public static void main(String[] args) {
		int number;
		
		Scanner scr=new Scanner(System.in);
		number=scr.nextInt();
		int count=0;
		int k=0;
		for(int i=1;i<number;i++){
			int m=i;
			int sum=1;
			while(m>0){
				
				
				k=m%10;
				m=m/10;
				sum*=k;
				
			}
		
			if(i*sum==number){
				System.out.println("SEED IS "+i);
			count++;	
			}
			
		}
		if(count==0)
			System.out.println("There is no seed");
		scr.close();

	}

}
