package demo1;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int dec=s.nextInt();
		String bin=Integer.toBinaryString(dec);
		System.out.println(bin);
		
		
	}
	
}

