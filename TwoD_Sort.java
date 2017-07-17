package Guvi;

import java.util.*;

public class TwoD_Sort {

	public static void main(String[] args) {
		 	int row,i,j,column,k = 0;
		   
		    Scanner in=new Scanner(System.in);  
		    
		    System.out.println("Enter Row and Column");
		    row=in.nextInt();
		    column=in.nextInt();
		    
		    int[] arr=new int[row*column];
		    int[][] arr1=new int[row][column];
		    
		    System.out.println("Enter the Values");
		    for(i=0;i<column*row;i++)
		    	{arr[i]=in.nextInt();}
		    
		    Arrays.sort(arr);
	
		    for(i=0;i<row;i++)
		    {
		    	for(j=0;j<column;j++)
		    	{
		    		arr1[i][j]=arr[k];
		    		k++;
		    	}
		    }
		    
		    for(i=0;i<row;i++)
		    {
		    	for(j=0;j<column;j++)
		    	{
		    		System.out.print(arr1[i][j]);
		    	}
		    	System.out.println("");
		    }
		    in.close();
		}
	}
