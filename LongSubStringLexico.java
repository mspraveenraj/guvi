package Guvi;

import java.util.*;

public class LongSubStringLexico {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str=in.next();
		
		String Sub="";
		
		for(int i=1;i<str.length();i++){
			 int a=str.charAt(i)-str.charAt(i-1);
			 if(a>0){
				 Sub=str.substring(i);
				 break;
			 }
		}
		if(Sub.length()==0)
			System.out.println("No Such Largest SubString Present");
		else
			System.out.println("Largest Substring is : "+Sub);
		in.close();
		}
	}
