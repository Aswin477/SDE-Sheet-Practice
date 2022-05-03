package demo1;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the size of array");
       int num=s.nextInt();
       
       int arr[]=new int[num];
       System.out.println("Enter the elements of array");
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i]=s.nextInt();
    	   sum+=arr[i];
       }
       System.out.println("average of all elements " +sum/num);
	}
	
}

