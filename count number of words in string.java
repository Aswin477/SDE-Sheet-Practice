package demo1;

import java.util.Scanner;

public class Hell {

	public static void main(String[] args) {
		int count=1;
		Scanner s=new Scanner(System.in);//enter the string
		String text=s.nextLine();
		for(int i=0;i<text.length()-1;i++)
		{
			if(text.charAt(i)==' ' && text.charAt(i+1)!=' ');
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
