import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String arr[]=str.split(" ");//to store elements with spaces
		String tot="";//to add the elements and to print that
		for(int i=arr.length-1;i>=0;i--)
		{
		    tot=tot+arr[i]+" ";
		}
		System.out.println(tot);
	}
}

