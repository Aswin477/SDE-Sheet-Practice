package demo1;


import java.util.Scanner;

public class Hash {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String text=sc.nextLine();
		String trimmedtext=text.replaceAll("\\s","");
		System.out.println(trimmedtext);
	
		
	}
