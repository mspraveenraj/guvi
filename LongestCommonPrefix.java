package Guvi;

import java.util.*;

public class LongestCommonPrefix {

		public static void main(String[] args) {
		
			int max=999999;
			int j=0;
		
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the Number of Strings");
			int n=in.nextInt();
				
			String str[]=new String[n];
			
			System.out.println("Enter the Strings");
			for(int i=0;i<n;i++)
				str[i]=in.next();

			for(int i=0;i<n;i++){
				if(str[i].length()<max){
					max=str[i].length();
					j=i;
				}
			}
			
			int t=0,t1=0;
			
			while(t==0&&(t+t1)<max){
				char ch=str[j].charAt(t+t1);
				for(int i=0;i<str.length;i++){
					if((str[i].charAt(t+t1)!=ch)||(t1==str[0].length())){
						t=1;
						break;
					}
				}
				if(t==0)
					t1++;
			}
			System.out.println(str[j].substring(0,t1));
			in.close();
			}
		}