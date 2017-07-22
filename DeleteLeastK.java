package Guvi;

import java.util.*;

public class DeleteLeastK {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = in.nextInt();
		
		System.out.println("Enter the number of digits to be removed: ");
		int k = in.nextInt();
		
		String str = "" + n;
		
		if (k < str.length() && k > 0) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			str = "";
			for (int i = 0; i < ch.length - k; i++) {
				str += ch[i];
			}
			System.out.println(Integer.parseInt(str));
		} else {
			System.out.println("Invalid Please enter correct details");
		}
		in.close();
	}
}
