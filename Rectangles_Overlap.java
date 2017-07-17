package Guvi;

import java.util.*;
public class Rectangles_Overlap {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] x=new int[8];
		int[] y=new int[8];
		
		System.out.println("Enter rectangle 1 co-ordinates");
        
        for(int i=0;i<8;i++)
        	x[i]=in.nextInt();
        
    	System.out.println("Enter rectangle 2 co-ordinates");
        
        for(int i=0;i<8;i++)
        	y[i]=in.nextInt();
        
        if((x[2]>y[6]||y[2]>x[6]||x[3]>y[7]||y[3]>y[7]))
            System.out.println("Possible");
        else 
        	System.out.println("Not Possible");

        in.close();
	}
}
