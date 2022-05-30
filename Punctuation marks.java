package learn;

import java.util.Scanner;

public class St{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the text");
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='!'||str.charAt(i)==';'||str.charAt(i)==','||str.charAt(i)=='?'||str.charAt(i)=='-'||str.charAt(i)=='{'||str.charAt(i)=='}'||str.charAt(i)==':')
			{
				count+=1;
			}
		}
		System.out.println(count);
		
		

	}

}

