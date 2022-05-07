package demo1;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int num=s.nextInt();
		String str=Integer.toOctalString(num);
		System.out.println(str);
		
	}
	
}
