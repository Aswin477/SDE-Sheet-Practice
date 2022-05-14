package demo1;

import java.util.Scanner;

public class Practice2 {
	 public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Enter number");
	int n=s.nextInt();
	for(int i=0;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
 }
}

