import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the values");
		String arr[]=s.nextLine().split(" : ");
		int A=Integer.parseInt(arr[0]);
		int B=Integer.parseInt(arr[1]);
		int C =Integer.parseInt(arr[2]);
		System.out.println((A+B)/C);
	}
}

