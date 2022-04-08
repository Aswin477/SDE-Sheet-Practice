import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    String s1=s.nextLine();
    //to reverse the words we need to use string Array
    String a[ ]=s1.split(" ");//in split we can denote where we want to stop and reverse
    for(int i=a.length-1;i>=0;i--)
    {
         System.out.print(a[i]+" ");
    }
	}
}
