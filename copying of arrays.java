import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr1[]={2,7,1,5,3,6,9};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
		    arr2[i]=arr1[i];
		}
		for(int j:arr2)
		{
		    System.out.println(j);
		}
	}
}

