package Guvi;

import java.util.*;
public class DAG_rep {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Dag");
		
		int sum=0;
		String str=in.nextLine();
		
		char c=(char)(92);
		str=str.replace(c, ',');
		
		String[] b=str.split(','+"");
		for(int i=0;i<b.length;i++){
			int max=0;
		String[] abc=b[i].split(" ");
		for(int j=0;j<abc.length;j++){
			
			if(!(abc[j].equals("/")||abc[j].equals("")))
				{
				int v=Integer.parseInt(abc[j]);
				if(v>max)
					max=v;
				}
		}
		sum+=max;
	}
		System.out.println(sum);
		in.close();
	}
}
